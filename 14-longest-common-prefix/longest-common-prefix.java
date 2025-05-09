class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last. charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

// class Solution {
//     public String longestCommonPrefix(String[] words) {
//           if (words.length == 0) return "";
//         String prefix = words[0];
//         for (int i = 1; i < words.length; i++) {
//             while (prefix.length() > 0 && !words[i].startsWith(prefix)) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//             }
//         }
//         return prefix;
//     }
// }