class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int left = 0 ;
        while (left<word1.length() || left<word2.length()) {
            if (left<word1.length()) {
                sb.append(word1.charAt(left));
            }
            if (left<word2.length()) {
                sb.append(word2.charAt(left));
            }
            left++;
        }
        return sb.toString();
    }
}