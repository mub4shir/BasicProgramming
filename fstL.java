import java.io.*;
import java.util.*;
public class fstL {

     static void findthree(int arr[], int n) {

        int fL = -99999, sL = -99999, tL = -99999;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > fL ) {
            tL = sL;
            sL = fL;
            fL = arr[i];
        } else if (arr[i] > sL) {
            tL = sL;
            sL = arr[i];
        } else if (arr[i] > tL) {
            tL = arr[i];
        }
        }
        System.out.print(fL + " " + sL + " " + tL );


    }
    public static void main(String[] args) {
//        int arr[] = {1, 2, 8, 10, 15, 4, 25};
//        int n = arr.length;
        int i, lt;
        Scanner sc = new Scanner(System.in);
        lt = sc.nextInt();
        //System.out.println(lt);
        for(int j = 0; j< lt; j++) {
            int n = sc.nextInt();
            //System.out.println(n);
            int[] arr = new int[n + 1];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                //System.out.print(arr[i] + " ");
            }
            findthree(arr, n);
            System.out.println();

        }


    }
}




