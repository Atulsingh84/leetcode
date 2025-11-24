class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int x : nums){
            int i = Math.abs(x)-1;
            nums[i] = -Math.abs(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}