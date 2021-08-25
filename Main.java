import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        int N , M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        if(N % M == 0 || N ==M )
            System.out.println("Yes");
        else if(N % M !=0)
            System.out.println("No");

    }
}