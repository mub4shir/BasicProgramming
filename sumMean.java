public class sumMean {
    static void SumAndMean(int arr[],int N){
        int sum =0;
        int mean = 0;
        for(int i = 0 ; i < N; i++) {

            sum += arr[i];
            mean = sum/N;

        }
        System.out.print(sum + " " + mean);
    }


    public static void main(String[] args) {
        int N = 5;
        int [] arr = { 1, 2, 19, 28, 5};
        SumAndMean(arr, N);

    }
}
