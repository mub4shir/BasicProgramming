public class zerosss {

        public void duplicateZeros(int[] arr) {
            int[] newArr = new int[arr.length];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    newArr[j] = arr[i];
                } else {
                    newArr[j] = 0;
                    j++;
                    if (j >= arr.length) break;
                    newArr[j] = 0;
                }
                j++;
                if (j >= arr.length) break;
            }
            System.arraycopy(newArr,0,arr,0,newArr.length);
        }
    }

