import vo.TreeNode;

public class Main13 {

    public static int[][] generateMatrix(int n) {
        int [][] ans=new int[n][n];
        int i = 1;
        int x=0,y=0;
        while (i <= n * n) {
            ans[y][x]=i;
            if(x+1<n&&ans[x+1][y]==0&&y+1<=n/2){
                x++;
            }else if(y+1<n&&ans[x][y+1]==0&&x+1>n/2){
                y++;
            }else if((x>0&&ans[x-1][y]==0)&&y+1>n/2){
                x--;
            }else if(y>0||ans[x][y-1]==0){
                y--;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        generateMatrix(5);
        System.out.print(1);
    }


}
