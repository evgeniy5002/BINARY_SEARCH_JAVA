public class BinarySearch {
    public static int binarySearch(int []array, int target) {

        if (array.length <= 0 || target < array[0] || target > array[array.length - 1]) {
            return -1;
        }
        else {
            int len = array.length;
            int left = 0;
            int right = len - 1;
            int mid;

            while (left <= right) {
                mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid;
                }
                else if (target < array[mid]) {
                    right = mid - 1;
                }
                else if (target > array[mid]) {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
