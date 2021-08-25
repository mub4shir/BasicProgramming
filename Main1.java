import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //5
        //2 3 4 5 6
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        //[2,3,4,5,6]
        System.out.print(a[0]*a[1]+" "); //6
        for(int i = 1; i <= n-2 ; i++){
            //for each a[i]
            System.out.print(a[i-1]*a[i+1]+" ");//8 15 24
        }
        System.out.print(a[n-2]*a[n-1]);//30
    }
}