class Solution {
    public String reverseWords(String s) {
        String [] newStr = s.strip().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i=newStr.length-1;i>=0;i--) {
            sb.append(newStr[i]);
            if(i>0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}