import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class floor_of_number {
    static int floorOfNumber (int @NotNull [] arr, int target) {
//        Greatest integer less than or equal to target
//        Returns the element itself, if the index is needed
//        change arr[middle] with middle
        int start = 0;
        int end = arr.length - 1;
        int middle;
        int res = Arrays.stream(arr).min().getAsInt();

        while (start <= end) {
            if (target > arr[arr.length - 1]) {
                return -1;
            }

            middle = start + (end -  start)/2;
            if (target > arr[middle]) {
                res = Math.max(res, arr[middle]);
                start = middle + 1;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                return arr[middle - 1];
            }
        }
//        return arr[end];
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 12, 14, 18, 23, 26, 31, 36, 45, 48, 54, 67, 78, 89};
        int target = 41;
        int res = floorOfNumber(arr, target);
        System.out.println(res);
    }
}
