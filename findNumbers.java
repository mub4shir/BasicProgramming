public class findNumbers {
    public static void main(String[] args) {
        //int num = 123456789;
        int[] arr = {437,315,322,431,686,264,442};
        int count = 0;
        int counter =0;
        for(int i= 0; i < arr.length; i++) {
            count =0;
            while (arr[i] != 0) {
                arr[i] /= 10;
                count++;


            }
            if(count % 2 == 0)
                counter++;
        }
        System.out.println(counter);
    }
}
