class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String a:word1) {
            sb.append(a);
        }

        for (String b:word2) {
            sb2.append(b);
        }

        if(sb.toString().equals(sb2.toString())) {
            return true;
        }
        return false;
    }
}