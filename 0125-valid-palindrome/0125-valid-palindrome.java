class Solution {
    public boolean isPalindrome(String s) {
        String palindrome ="";

        
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                palindrome+=s.charAt(i);
            }
        }
        palindrome=palindrome.toLowerCase();

        int start=0;
        int end=palindrome.length()-1;

        while(start<end){
            if(palindrome.charAt(start)!=palindrome.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}