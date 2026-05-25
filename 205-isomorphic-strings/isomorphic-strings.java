class Solution {
    public boolean isIsomorphic(String s, String t) {
    char [] sChars = new char[256];
    char [] tChars = new char[256];

    for (int i=0;i<s.length();i++) {
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        if(sChars[s.charAt(i)]==0 && tChars[t.charAt(i)]==0) {
            sChars[sChar] = tChar;
            tChars[tChar] = sChar;
        } else if(sChars[sChar]!=tChar) {
            return false;
        }
    }
        return true;
    }
}