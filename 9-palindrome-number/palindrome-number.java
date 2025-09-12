class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int original = x;
        int reversed = 0;
          
          while(x != 0){
            int didgit  = x % 10;
            reversed = reversed * 10 +didgit;
            x = x/10;
          }
          return reversed ==  original;
    }
}