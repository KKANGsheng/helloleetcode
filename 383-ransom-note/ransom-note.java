class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] characters = new int[26];

        for (char c:magazine.toCharArray()) {
            characters[c-'a']++;
        }

        for (char b:ransomNote.toCharArray()) {
            characters[b-'a']--;
        }

        for (int character:characters) {
            if(character<0) {
                return false;
            }
        }
        return true;
    }
}