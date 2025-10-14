class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int result =0;
        for(int i=0;i<n;i++){
            int number = columnTitle.charAt(i) - 'A'+1;
            result = result*26+number; 
        }
        return result;
    }
}