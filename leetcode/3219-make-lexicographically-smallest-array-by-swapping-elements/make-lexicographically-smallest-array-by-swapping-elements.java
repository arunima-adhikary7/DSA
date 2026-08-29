import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        // Store {value, original index}
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int[] result = new int[n];

        int start = 0;

        while (start < n) {
            int end = start;

            // Find a group where consecutive values differ <= limit
            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            // Collect original indices of this group
            List<Integer> indices = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indices.add(arr[i][1]);
            }

            // Sort indices so smallest values go to smallest indices
            Collections.sort(indices);

            // Assign sorted values to sorted original indices
            for (int i = start; i <= end; i++) {
                result[indices.get(i - start)] = arr[i][0];
            }

            start = end + 1;
        }

        return result;
    }
}