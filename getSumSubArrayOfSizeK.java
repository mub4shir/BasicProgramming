public class getSumSubArrayOfSizeK {
    static int getSum(int[] a, int k){
        int start=0;
        int sum=0;
        int maxSum=0;
        for (int end = 0; end < a.length; end++) {
            sum=sum+a[end];
            if(end>=k-1){
                maxSum=Math.max(sum,maxSum);
                sum=sum-a[start];
                start++;
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a ={2,1,5,1,3,2};
        int k = 3;
        System.out.println(getSum(a,k));


    }

}
