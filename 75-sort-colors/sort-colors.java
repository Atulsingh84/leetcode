class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
           boolean flag = false;

           for(int j=0;j<n-i-1;j++){
            if(nums[j]> nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                flag = true;
            }
           }
           if(flag == false){
            return;
           }
        }
    }
}