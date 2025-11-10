class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        int maxFreq=0;
        int total=0;

        for(int num:nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        for(int freq:hashMap.values()){
            if(freq>maxFreq){
                maxFreq=freq;
            }
        }

        for(int freq:hashMap.values()){
            if(freq==maxFreq){
                total+=freq;
            }
        }
        
        return total;


    }
}