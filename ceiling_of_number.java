import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ceiling_of_number {
     static int ceilingOfNumber (int @NotNull [] arr, int target) {
//        Minimum greatest number of target (least integer number greater than or equal to target),
//        returns the number itself, if index is needed
//        change arr[middle] with middle
        int start = 0;
        int end = arr.length - 1;
        int middle;
        int res = Arrays.stream(arr).max().getAsInt();

        while(start <= end) {
            if (target > arr[arr.length - 1]) {
                return -1;
            }

            middle = start + (end - start)/2;
            if (target > arr[middle]) {
                start = middle + 1;
            }
            else if (target < arr[middle]) {
                res = Math.min(res, arr[middle]);
                end = middle - 1;
            }
            else {
                return arr[middle + 1];
            }
        }
        System.out.println("Start after while loop " + start);
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9, 12, 15, 19, 23, 27, 28, 31, 44, 52, 59, 62};
        int target = 20;
        int res = ceilingOfNumber(arr, target);
        System.out.println(res);
    }
}
