public class Test {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 2, 5, 6};
        int target = 10;
        System.out.println("the element is at index "+findIndexOfElement(arr, target));
    }

    private static int  findIndexOfElement(int[] arr, int target) {
        for (int i =0; i<arr.length; i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }


}
