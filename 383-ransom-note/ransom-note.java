class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []counts= new int[26];

        for(char a:magazine.toCharArray()){
            counts[a-'a']++;
        }

        for(char b:ransomNote.toCharArray()){
            counts[b-'a']--;
        }

        for(int count:counts){
            System.out.println("a" +count);
            if(count<0){
                return false;
            }
        }
        return true;
    }
}