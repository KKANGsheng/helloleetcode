class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        final List<Integer> result= new ArrayList<>();

        if(p.length()>s.length()){
            return result;
        }

        int[]pCount=new int[26];
        int[]sCount=new int[26];

        for(char ch:p.toCharArray()){
            pCount[ch-'a']++;
        }

        int left=0;

        for(int right=0;right<s.length();right++){
            sCount[s.charAt(right)-'a']++;

            if(right>=p.length()){
                sCount[s.charAt(left)-'a']--;
                left++;
            }

            if(Arrays.equals(pCount,sCount)){
                result.add(left);
            }
        }
        return result;

    }
}