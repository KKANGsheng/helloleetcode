class Solution {
    public String reverseWords(String s) {
        String []String=s.trim().split("\\s+");
        StringBuilder stringBuilder =new StringBuilder();


        for(int i=String.length-1;i>=0;i--){
            stringBuilder.append(String[i]);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }
}