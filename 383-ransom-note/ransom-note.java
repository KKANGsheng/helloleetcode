class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[]characters=new int[26];

        for(int i=0;i<ransomNote.length();i++){
            characters[ransomNote.charAt(i)-'a']++;
        }

        for(int j=0;j<magazine.length();j++){
            characters[magazine.charAt(j)-'a']--;
        }

        for(int i=0;i<characters.length;i++){
            if(characters[i] >0){
                return false;
            }
        }
        return true;
    }
}