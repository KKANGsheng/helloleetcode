class Solution {
    public char findTheDifference(String s, String t) {
        int[] result = new int[26];

        for (char a:t.toCharArray()) {
            result[a-'a']++;
        }

        for (char b:s.toCharArray()) {
            result[b-'a']--;
        }

        for (int i=0;i<26;i++) {
            if(result[i]!=0){
                return (char) (i+'a');
            }
        }
        return ' ';
   }  
}