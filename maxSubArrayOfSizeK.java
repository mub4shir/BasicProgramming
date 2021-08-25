public class maxSubArrayOfSizeK {
    static int bruteForce(int[] a, int k){
        int maxSum =0;
        for (int i = 0; i < a.length-k; i++) {
            int sum =0;
            for(int j =i; j<i+k; j++ ){
                sum +=a[j];
            }
            maxSum= Math.max(sum,maxSum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a={2,1,5,1,3,2};
        int k=3;
        System.out.println(bruteForce(a,k));

    }
}
