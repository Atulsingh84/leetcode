class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int po = 0;
        int ne = 0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i] > 0){
            pos[po++] = nums[i];
        }
        else{
            neg[ne++] = nums[i];
        }

       }
 
      int[] result  = new int[n];
      int i =0, j=0, k=0;

      while(i < pos.length && j<neg.length){
        result[k++] = pos[i++];
        result[k++] = neg[j++];
      }

      return result;
    }
}