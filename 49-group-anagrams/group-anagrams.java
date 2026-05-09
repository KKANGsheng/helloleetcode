class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> hashMap = new HashMap<>();

    for (int i=0;i<strs.length;i++) {
        char [] characters = strs[i].toCharArray();
        Arrays.sort(characters);
        String sortString = new String(characters);
        
        if(!hashMap.containsKey(sortString)) {
            hashMap.put(sortString,new ArrayList<>());
        }
        hashMap.get(sortString).add(strs[i]);
    }

    return new ArrayList<>(hashMap.values());
 }
}