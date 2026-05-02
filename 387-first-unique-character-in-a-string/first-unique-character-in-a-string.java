class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character,Integer> hashMap = new HashMap<>();
    for (int i=0;i<s.length();i++) {
        hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
    }

    for (int j=0;j<s.length();j++) {
        if (hashMap.get(s.charAt(j))==1) {
            return j;
        }
    }
    return -1;
  }
}