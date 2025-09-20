class Solution {
    public String[] findWords(String[] words) {
    String row1 = "qwertyuiop";
    String row2 = "asdfghjkl";
    String row3 = "zxcvbnm";
         
    List<String> result = new ArrayList<>();

    for(String word : words){
      String lower = word.toLowerCase();
    
      boolean inrow1 = true, inrow2 = true, inrow3 = true;

    for(char C : lower.toCharArray()){
        if(row1.indexOf(C) == -1) inrow1 = false;
        if(row2.indexOf(C) == -1) inrow2 = false;
        if(row3.indexOf(C) == -1) inrow3 = false;
    }   
     if(inrow1 || inrow2 || inrow3)
      result.add(word);
     
    }
    return result.toArray(new String[0]);
}
}