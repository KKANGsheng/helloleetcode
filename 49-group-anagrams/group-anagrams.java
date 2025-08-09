class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>>map=new HashMap<>();

    for(String s:strs){
        String sortWord=performSort(s);
        map.putIfAbsent(sortWord,new ArrayList<>());
        map.get(sortWord).add(s);
    }

    return convertoList(map);
}

    public List<List<String>> convertoList(Map<String,List<String>>map){
        List<List<String>> list=new ArrayList<>();

        for(List<String>value:map.values()){
            list.add(value);
        }
        return list;
    }



    public String performSort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}