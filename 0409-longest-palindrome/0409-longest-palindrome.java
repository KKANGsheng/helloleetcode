class Solution {
    public int longestPalindrome(String s) {
        int[]characters=new int[128];

        for(char c:s.toCharArray()){
            characters[c]++;
        }

        int result=0;


        for(int c:characters){
            result+=c/2*2;
        }

        if(result<s.length()){
            result+=1;
        }

        return result;


    }
}