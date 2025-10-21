class Solution {
    public int thirdMax(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (seen.contains(num)) continue;
            seen.add(num);
            
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;

                }
        }
        
        return seen.size() >= 3 ? third : first;

    }
}