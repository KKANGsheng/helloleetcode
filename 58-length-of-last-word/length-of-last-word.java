class Solution {
    public int lengthOfLastWord(String s) {
        String[] results=s.split(" ");
        String result=results[results.length-1];

        return result.length();

    }
}