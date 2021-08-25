package com.example.helloworld;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class helloWorld {
    static int getMin(int arr[], int n) {
        int res = arr[0];

        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

     static int getMax(int arr[], int n){
        int res = arr[0];

        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
         return res;
    }
    public static void main (String[] args) {
        int i, lt;
        Scanner sc = new Scanner(System.in);
        lt = sc.nextInt();
        System.out.println(lt);
        for(int j = 0; j< lt; j++) {
            int  n = sc.nextInt();
            System.out.println(n);
            int[] arr =  new int[n+1];
            for (i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print(getMax(arr, n) + " " + getMin(arr, n));
            System.out.println();
        }

    }
}
//        int arr[] = {};
//        int z = arr.length;
//        for( int k = 0; k<lt; k++){
////            System.out.print(getMin(arr, z) + " " + getMax(arr, z));
////            System.out.println();
//        }



