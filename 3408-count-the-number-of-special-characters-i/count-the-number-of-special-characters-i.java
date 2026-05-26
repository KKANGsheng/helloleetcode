class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>hashSet = new HashSet<>();
        int count =0;
        for (int i=0;i<word.length();i++) {
            hashSet.add(word.charAt(i));
        }

        for(char c='a';c<='z';c++) {
            if(hashSet.contains(c) && hashSet.contains(Character.toUpperCase(c))) {
                count++;
            }
        }
        return count;
    }
}