class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int freq=0,max = 0;

        for(int i : nums){
            count[i]++;

            if(max < count[i]){
                max = count[i];
                freq = max;
            }
            else if (max == count[i]){
                freq += count[i];
            }
        }

        return freq;
        
    }
}