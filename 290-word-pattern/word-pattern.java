class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        HashMap<Character,String>letterMap=new HashMap<>();
        HashSet<String>wordMap=new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char letter=pattern.charAt(i);
            String word=words[i];

            if(letterMap.containsKey(letter)){
                if(!letterMap.get(letter).equals(word)){
                    return false;
                }
            }else {
                if(wordMap.contains(word)){
                    return false;
                }
                letterMap.put(letter,word);
                wordMap.add(word);
            }
        }

        return true;
    }
}