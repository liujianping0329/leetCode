import vo.TreeNode;

public class Main13 {

    public static int[][] generateMatrix(int n) {
        int [][] ans=new int[n][n];
        int i = 1;
        int x=0,y=0;
        int dir=1;
        while (i <= n * n) {
            if(i!=1){
                if(!judgeNextRange(x,y,n,dir,ans)){
                    dir++;
                }
                if(dir%4==1){
                    x++;
                }else if(dir%4==2){
                    y++;
                }else if(dir%4==3){
                    x--;
                }else if(dir%4==0){
                    y--;
                }
            }
            ans[y][x]=i;
            i++;
        }
        return ans;
    }

    private static boolean judgeNextRange(int x, int y, int n, int dir,int[][] ans) {
        dir=dir%4;
        if(dir==1){
            if(x+1>=n||ans[x+1][y]!=0){
                return false;
            }
        }
        if(dir==2){
            if(y+1>=n||ans[x][y+1]!=0){
                return false;
            }
        }
        if(dir==3){
            if(x==0||ans[y][x-1]!=0){
                return false;
            }
        }
        if(dir==0){
            if(y==0||ans[y-1][x]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        generateMatrix(6);
        System.out.print(1);
    }


}
