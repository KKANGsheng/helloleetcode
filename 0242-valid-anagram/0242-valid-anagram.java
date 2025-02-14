class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] charSArray=s.toCharArray();
        char[] charTArray=t.toCharArray();

        Arrays.sort(charSArray);
        Arrays.sort(charTArray);

        return Arrays.equals(charSArray,charTArray);

    }
}