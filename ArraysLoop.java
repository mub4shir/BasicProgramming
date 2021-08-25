import java.util.Scanner;

public class ArraysLoop {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int[] squareNumbers = new int[10];
        for(int i = 0; i < 10; i++) {
           int square = (i + 1) * (i + 1);
           squareNumbers[i] = square;
//           System.out.println(squareNumbers[i]);

        }
        //int square = (i + 1) * (i + 1);
        for (int square : squareNumbers) {
            System.out.println(square);

        }


    }
}
