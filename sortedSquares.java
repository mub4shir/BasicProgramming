public class sortedSquares {

        public int[] sortedSquares(int[] nums) {
            int[] res = new int[nums.length];
            int start = 0;
            int end = nums.length-1;
            for (int i = nums.length-1; i >= 0; i--) {
                int current;
                if (Math.abs(nums[start])>nums[end]) {
                    current = nums[start];
                    start++;
                }else {
                    current = nums[end];
                    end--;
                }
                res[i] = current*current;
            }
            return res;

    }



}
