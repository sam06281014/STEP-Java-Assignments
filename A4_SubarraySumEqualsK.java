// A4. Subarray Sum Equals K
import java.util.HashMap;
import java.util.Map;

public class A4_SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {
        // Map of prefix sum -> number of times it has occurred
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // empty prefix base case

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) has been seen before, those subarrays sum to k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2)); // 2
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0)); // 3
    }
}
