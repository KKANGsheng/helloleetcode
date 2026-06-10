class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hashSet = new HashSet<>();
        HashSet<Integer>intersect = new HashSet<>();

        for (int i=0;i<nums1.length;i++) {
            hashSet.add(nums1[i]);
        }

        for (int j=0;j<nums2.length;j++) {
            if (hashSet.contains(nums2[j])) {
                intersect.add(nums2[j]);
            }
        }
        int [] result = new int[intersect.size()];
        int k=0;
        for (int num:intersect) {
            result[k] =num;
            k++;
        }

        return result;
    }
}