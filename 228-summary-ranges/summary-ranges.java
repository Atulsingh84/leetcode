class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result  = new ArrayList<>();
        if(nums.length ==0) return result;

        int start = nums[0];
        int prev = nums[0];

        for(int i=1;i<nums.length;i++){
          if(nums[i] == prev+1){
            prev = nums[i];
          }else{
            if(start == prev){
                result.add(String.valueOf(start));
            }
            else{
                result.add(start+"->"+prev);
            }
            start = nums[i];
            prev = nums[i];
          }
        }

        if (start == prev) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + prev);
        }
        

        return result;

        
    }
}