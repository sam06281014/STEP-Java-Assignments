// L4. Merge Two Sorted Arrays
import java.util.Arrays;

public class L4_MergeTwoSortedArrays {

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy over any remaining elements from arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Copy over any remaining elements from arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{}, new int[]{1, 2, 3})));
    }
}
