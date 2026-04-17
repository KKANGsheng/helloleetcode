class Solution {
    public boolean isAnagram(String s, String t) {
        int []count = new int[26];

        for(char a:s.toCharArray()){
            count[a-'a']++;
        }

        for(char b:t.toCharArray()){
            count[b-'a']--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;

    }
}