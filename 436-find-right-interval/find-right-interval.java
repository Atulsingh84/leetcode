class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        int n = intervals.length;
        int[] result = new int[n];

        // Step 1: Store start and their original index
        int[][] starts = new int[n][2]; // [start, originalIndex]
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        // Step 2: Sort by start values
        java.util.Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: For each interval, binary search based on its end value
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int left = 0, right = n - 1;
            int index = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (starts[mid][0] >= end) {
                    index = starts[mid][1];
                    right = mid - 1; // try to find smaller start
                } else {
                    left = mid + 1;
                }
            }

            result[i] = index;  // store result
        }

        return result;
    }
}