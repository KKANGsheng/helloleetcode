class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> hashMap = new HashMap<>();

    for (int i=0;i<strs.length;i++) {
       char [] characters = strs[i].toCharArray();
       Arrays.sort(characters);
       String newStr = new String(characters);
       if (!hashMap.containsKey(newStr)) {
            hashMap.put(newStr,new ArrayList<>());
       }
       hashMap.get(newStr).add(strs[i]);
    }
    return new ArrayList<>(hashMap.values());
 }
}