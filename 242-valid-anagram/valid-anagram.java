class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length()!=s.length()){
            return false;
        }

        int [] counts=new int[26];

        for(char c:s.toCharArray()){
            counts[c-'a']++;
        }

        for(char c:t.toCharArray()){
            counts[c-'a']--;
        }

        for(int count:counts){
            if(count!=0){
                return false;
            }
        }
       
        return true;
    }
}