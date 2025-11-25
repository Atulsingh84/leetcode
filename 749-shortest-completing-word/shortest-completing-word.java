class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
         int[] targetFreq = buildFreq(licensePlate);

        String answer = null;  // will store the best (shortest) completing word

        // 2. Check each word
        for (String word : words) {
            if (isCompletingWord(word, targetFreq)) {
                // if it's completing and (answer is null or this word is shorter)
                if (answer == null || word.length() < answer.length()) {
                    answer = word;
                }
            }
        }
        return answer;
    }

    // Build frequency array of size 26 (a-z) for the licensePlate
    private int[] buildFreq(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {    // ignore digits, spaces, etc.
                char c = Character.toLowerCase(ch); // case insensitive
                freq[c - 'a']++;
            }
        }
        return freq;
    }

    // Check if a word is a completing word for the target frequency
    private boolean isCompletingWord(String word, int[] targetFreq) {
        int[] wordFreq = new int[26];

        for (char ch : word.toCharArray()) {
            char c = Character.toLowerCase(ch);
            if (c >= 'a' && c <= 'z') {
                wordFreq[c - 'a']++;
            }
        }

        // word is completing if for every letter, wordFreq >= targetFreq
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < targetFreq[i]) {
                return false;
            }
        }
        return true;
        
    }
}