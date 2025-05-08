class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashSet<Integer> set = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, return true (duplicate found)
            if (set.contains(num)) {
                return true;
            }
            // If not, add the element to the set
            set.add(num);
        }
        
        // No duplicates found, return false
       
        return false;
        
    }
}