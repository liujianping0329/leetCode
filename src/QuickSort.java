import java.util.Arrays;

public class QuickSort {

    public static void main(String [] args){
        int [] data=new int[]{6,3,8,1,4};
        quickSort(data);
    }

    private static int[] catArrays(int[]... datas){
        int cou=0;
        for (int[] data : datas) {
            cou+=data.length;
        }
        int[] ans=new int[cou];
        int i=0;
        for (int[] data : datas) {
            for (int datum : data) {
                ans[i++]=datum;
            }
        }
        return ans;
    }

    private static int[] trimArray(int[] data,int [] visit){
        int cou=0;
        for (int i : visit) {
            if(i==1){
                cou++;
            }
        }
        int[] ans=new int[cou];
        int index=0;
        for (int i = 0; i < data.length; i++) {
            int datum = data[i];
            if (visit[i]==1){
                ans[index++]=datum;
            }
        }
        return ans;
    }

    private static int[] cutArray(int[] datas,int a,int b){
        int[] ans=new int[b-a+1];
        for(int i=0;i<b-a+1;i++){
            ans[i]=datas[a+i];
        }
        return ans;
    }

    private static int[] quickSort(int[] data) {
        if(data.length==1)return new int[]{data[0]};
        if(data.length==2){
            if(data[0]>data[1]){
                return new int[]{data[1],data[0]};
            }else{
                return new int[]{data[0],data[1]};
            }
        }

        int[] temp=new int[data.length*2+1];
        int [] visit=new int[data.length*2+1];
        temp[data.length]=data[0];
        visit[data.length]=1;
        int firstIndex=0;
        int secIndex=data.length+1;
        for(int i=1;i<data.length;i++){
            if(data[i]<data[0]){
                temp[firstIndex]=data[i];
                visit[firstIndex]=1;
                firstIndex++;
            }else{
                temp[secIndex]=data[i];
                visit[secIndex]=1;
                secIndex++;
            }
        }

        int[] firstPart = trimArray(cutArray(temp, 0, data.length - 1), cutArray(visit, 0, data.length - 1));
        int[] secondPart = trimArray(cutArray(temp, data.length +1, data.length *2), cutArray(visit, data.length +1, data.length *2));
        return catArrays(quickSort(firstPart),new int[]{data[0]},quickSort(secondPart));
    }
}
