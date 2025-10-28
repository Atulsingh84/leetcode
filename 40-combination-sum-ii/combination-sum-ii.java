class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start, 
                         List<Integer> current, List<List<Integer>> result) {
        // Base case: if target becomes 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Explore all possibilities
        for (int i = start; i < candidates.length; i++) {
            // Skip if current candidate is larger than remaining target
            if (candidates[i] > target) {
                break;
            }
            
            // Skip duplicates at the same level
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            // Choose the current candidate
            current.add(candidates[i]);
            
            // Explore further with reduced target and next index
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            
            // Undo the choice (backtrack)
            current.remove(current.size() - 1);
        }
    }
}