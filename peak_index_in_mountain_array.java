public class peak_index_in_mountain_array {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start)/2;
            if (arr[middle] < arr[middle + 1]) {
                start = middle + 1;
            }
            else {
                end = middle;
            }
        }
        return end;
    }
}
