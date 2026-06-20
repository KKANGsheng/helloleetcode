class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0;
        int maxLength=0;
        for (int i=0;i<s.length();i++) {
            while (hashSet.contains(s.charAt(i))) {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(i));
            maxLength = Math.max(maxLength,i-left+1);
        }
        return maxLength;
  }
}