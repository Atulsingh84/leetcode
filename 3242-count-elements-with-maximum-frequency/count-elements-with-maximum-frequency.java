class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int freq=0,max = 0;

        for(int i : nums){
            count[i]++;
        }
          
        for(int c:count){
            if(max < c) max = c;   
            }


        for(int c:count){   
         if (max == c)freq += c;
            
        }

        return freq;
        
    }
}