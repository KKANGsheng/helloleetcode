class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int []a=new int[26];


        for(char chars:s.toCharArray()){
            a[chars-'a']++;
        }

        for(char chart:t.toCharArray()){
            a[chart-'a']--;
        }

        for(int num:a){
            if(num >0){
                return false;
            }
        }


        return true;

    }
}