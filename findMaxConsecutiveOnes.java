public class findMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] input= {1,1,1,1,1,1,1,1,1,1,1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1,1,1,1,1,1,0};
        // Hint: Initialise and declare a variable here to
        // keep track of how many 1's you've seen in a row.
        int n=input.length;
        int maxCount=0;
        int previousMax=0;
        for(int i=0;i<n;i++) {
            if(input[i]==1) {
                maxCount++;
            }
            else {
                previousMax=Math.max(previousMax, maxCount);
                maxCount=0;
            }
        }
        System.out.println(Math.max(maxCount,previousMax));

    }
}

