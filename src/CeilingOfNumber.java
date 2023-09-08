public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 9, 17, 18, 19};
        int target = 18;
        int ceil = ceiling(arr, target);

        System.out.println(ceil);
    }

    public static int ceiling(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}
