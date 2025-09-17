class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0) return false;
        // int original = x;
        // int reversed = 0;
          
        //   while(x != 0){
        //     int didgit  = x % 10;
        //     reversed = reversed * 10 +didgit;
        //     x = x/10;
        //   }
        //   return reversed ==  original;

          String strnum = String.valueOf(x);
          int left = 0;
          int right = strnum.length()-1;
          while(left < right){
            if(strnum.charAt(left) != strnum.charAt(right)) return false;
            left++;
         right--;
          }
        return true;
    
    }

}