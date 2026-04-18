class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int []result =new int[26];

    for(char a:magazine.toCharArray()){
        result[a-'a']++;
    }

    for(char b:ransomNote.toCharArray()){
        result[b-'a']--;
    }

    for(int i=0;i<result.length;i++){
        if(result[i]<0){
            return false;
        }
    }
    return true;
 }
}