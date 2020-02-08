import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main47 {


    public static void main(String[] args) {

        int[] a=new int[]{1,3,5};
        int[] b=new int[]{2,4,6,7};
        int la=a.length;
        int lb=b.length;
        int[] c=new int[la+lb];
        int i = 0, j = 0, k = 0;

        while (i < la && j < lb) {
            if (i >= la) {
                c[k++] = b[j++];
            } else if (j >= lb) {
                c[k++] = a[i++];
            } else if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }

        }
    }


}
