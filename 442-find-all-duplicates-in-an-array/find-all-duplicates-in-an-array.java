class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arrayList =new ArrayList<>();
        Set<Integer> hashSet =new HashSet<>();

        for(int num:nums){
            if(hashSet.contains(num)){
                arrayList.add(num);
            }
            hashSet.add(num);
        }
        


        return arrayList;
    }
}