class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characters= new int[26];

        for(char a:s.toCharArray()){
            characters[a-'a']++;
        }

        for(char b:t.toCharArray()){
            characters[b-'a']--;
        }

        for(int chars:characters){
            if(chars!=0){
                return false;
            }
        }
        return true;
    }
}