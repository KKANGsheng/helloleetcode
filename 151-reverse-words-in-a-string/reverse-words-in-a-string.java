class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String str= s.strip().replaceAll("\\s+"," ");
        String[] strings=str.split(" ");

        for(int i=strings.length-1;i>=0;i--){
            sb.append(strings[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}