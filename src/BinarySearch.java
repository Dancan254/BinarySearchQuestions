public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 9, 17, 18, 19};
        int target = 18;
        int result = binSearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + result);
        }

    }

    public static int binSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        //int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            //int mid  = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                //result = arr[mid];
                right = mid - 1;
            }
        }
        return -1;
    }


}
