public class binary_search {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        int middle;

        while (start<=end) {
            middle = start + (end - start)/2;
            if (nums[middle] < target) {
                start = middle + 1;
            }
            else if (nums[middle] > target) {
                end = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
