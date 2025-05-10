class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // just add 1 and done
                return digits;
            }
            digits[i] = 0;  // set to 0 and carry will go to next digit
        }
        
        // If we reach here, all were 9's — need extra digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
     
    }
}