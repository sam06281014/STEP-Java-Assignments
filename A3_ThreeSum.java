// A3. 3Sum
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A3_ThreeSum {

    static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});

                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] result1 = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (int[] triplet : result1) {
            System.out.println(Arrays.toString(triplet));
        }

        System.out.println("---");

        int[][] result2 = threeSum(new int[]{0, 0, 0});
        for (int[] triplet : result2) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
