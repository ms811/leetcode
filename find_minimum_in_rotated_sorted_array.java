public class find_minimum_in_rotated_sorted_array {
        public int findMin(int[] nums) {
            int start = 0;
            int end = nums.length-1;
            int middle;
            int res = nums[0];

            while (start <= end) {
                if (nums[start] < nums[end]) {
                    res = Math.min(res, nums[start]);
                }

                middle = start + (end - start)/2;
                res = Math.min(res, nums[middle]);
                if (nums[start] <= nums[middle]) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
            return res;
        }
}
