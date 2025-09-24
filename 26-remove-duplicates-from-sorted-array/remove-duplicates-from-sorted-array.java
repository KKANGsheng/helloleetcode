class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hashSet=new HashSet<>();
        int count=0;


        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
                nums[count]=nums[i];
                count+=1;
            }
        }
        return count;
    }
}