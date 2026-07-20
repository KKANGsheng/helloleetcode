class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i=0;i<words.length;i++) {
            hashMap.put(words[i],hashMap.getOrDefault(words[i],0)+1);
        }
        List<String> result = new ArrayList<>(hashMap.keySet());
        result.sort((a,b)->{
            int freqCompare = hashMap.get(b) - hashMap.get(a);
            if (freqCompare == 0) {
                return a.compareTo(b);
            }
            return freqCompare;
        });
        return result.subList(0,k);
    }
}