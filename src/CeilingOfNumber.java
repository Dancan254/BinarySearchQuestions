public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 9, 17, 18, 19};
        int target = 16;
        int ceil = ceiling(arr, target);

        System.out.println(ceil);
    }

    //modified to return the ceil number
    public static int ceiling(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
            else{
                result = arr[mid];
                right = mid - 1;
            }
        }
        //return left;//returns the index of the smallest num that is greater than target
        //return right; //returns the greatest num that is smaller than the target
        return result;//returns the actual value
    }
}
