import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class divisor {
    public static void main (String[] args) {
        //5
        //1 2 16 16 16
        //1 2 4 8 16

        //4
        //1 3 8 4
        //1 3 4 4 - NO

        //ignore the first element
        //basically whatever is the first element I can replace
        //it to 1
        //1 2 3 4 5 6

        //second element, index = 1, divisor = 2
        //divisor >= next element, divisor >= a[i+1] print NO
        //a[i] % divisor != 0 && divisor <= a[i]
        //divisor++;


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int divisor = 2;

        for(int i = 1; i < n - 1; i++){
            while(a[i]%divisor!=0){
                divisor++;
            }
            if(divisor >= a[i+1]){
                System.out.println("NO");
                return;
            }
            a[i] = divisor;
            divisor++;
        }
        System.out.println("YES");

    }
}


