class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int []array;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
            nums[count]=nums[i];
            count+=1;
        }
     }
        return count;
    }
}