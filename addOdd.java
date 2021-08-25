import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
    class addOdd{
        public static void main (String[] args) {
            int i;
            int Size;
            Scanner sc = new Scanner(System.in);
            Size = sc.nextInt();
            int [] a = new int[Size+1];
            for (i = 0; i < Size; i++){
                a[i] = sc.nextInt();

            }
            // for(i = 0; i < Size; i++){
            // 	System.out.print(a[i] + " ");
            // }
            int count = 0 ;
            for(i = 0; i < Size; i++) {
                if(a[i] % 2 == 0)
                    continue;
                else
                    count += a[i];


            }
            System.out.println(count);

        }
    }

