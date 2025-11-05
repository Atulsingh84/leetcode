import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // If the current list length equals nums length, we have a complete permutation
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current)); // add a COPY of current list
            return;
        }

        // Try placing each number in the next position
        for (int num : nums) {
            // If the number is already used, skip it
            if (current.contains(num)) continue;

            // Choose the number
            current.add(num);

            // Recurse to build the rest of the permutation
            backtrack(nums, current, result);

            // Undo the choice (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}