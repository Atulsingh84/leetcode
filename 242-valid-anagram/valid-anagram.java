class Solution {
    public boolean isAnagram(String s, String t) {
     int index;

    if(s.length() != t.length()){
        return false;
    }
    int[] arr = new int[26];

    for(int i=0;i<s.length(); i++){
        index = s.charAt(i) - 'a';
        arr[index]++;
    }
    for(int j=0; j<t.length(); j++){
        index = t.charAt(j) - 'a';
        arr[index]--;
    }
    for(int i=0;i<arr.length;i++){
        if( arr[i]  != 0){
            return false;
        }
    }
        return true;
    }
}