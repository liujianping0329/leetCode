import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main8 {
    //    https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans+=getIncrease(grid,grid[i][j],i,j);
            }
        }
        return ans;
    }

    private static int getIncrease(int[][] grid, int cur, int i, int j) {
        int [] row=grid[i];
        int [] col=new int[grid.length];
        for (int i1 = 0; i1 < grid.length; i1++) {
            col[i1]=grid[i1][j];
        }

        int rowMax=0;
        for (int i1 = 0; i1 < row.length; i1++) {
            if(rowMax<row[i1]){
                rowMax=row[i1];
            }
        }

        int colMax=0;
        for (int i1 = 0; i1 < col.length; i1++) {
            if(colMax<col[i1]){
                colMax=col[i1];
            }
        }

        int min = Math.min(rowMax, colMax);
        return min-cur;
    }


    public static void main(String[] args) {
        int[][] grid={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

}
