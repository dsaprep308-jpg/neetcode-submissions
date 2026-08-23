public class Solution {

    /**
     * Finds the indices of the two numbers in {@code nums} that add up to {@code target}.
     *
     * @param nums   the list of integers to search
     * @param target the desired sum
     * @return a list containing the two indices, or an empty list if no such pair exists
     */
    public int[] twoSum(int[] nums, int target) {
        // Map each number to its index as we iterate through the list
        Map<Integer, Integer> numsVsIndicesMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int diff = target - currentNumber; // the value we need to find

            if (numsVsIndicesMap.containsKey(diff)) {
                // We have found the complement; return the pair of indices
                return new int[] { numsVsIndicesMap.get(diff), i };
            }

            // Store the current number and its index for future complement checks
            numsVsIndicesMap.put(currentNumber, i);
        }

        // No pair found – return an empty array
        return new int[0];
    }
}