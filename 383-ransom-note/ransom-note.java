class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // Create a frequency array for magazine characters
        int[] charCount = new int[26];
        
        // Count all characters in magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Check each character in ransomNote
        for (char c : ransomNote.toCharArray()) {
            // If character doesn't exist or not enough count, return false
            if (charCount[c - 'a'] <= 0) {
                return false;
            }
            // Use one occurrence of this character
            charCount[c - 'a']--;
        }
        
        return true;
    }
}
