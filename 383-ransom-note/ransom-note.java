class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int result[]=new int[26];

        for(char c:ransomNote.toCharArray()){
            result[c-'a']++;
        }

        for(char c:magazine.toCharArray()){
            result[c-'a']--;
        }

        for(int i=0;i<result.length;i++){   
            System.out.println("resultI "+result[i]);

            if(result[i]>0){
                return false;
            }
        }

        return true;
    }
}