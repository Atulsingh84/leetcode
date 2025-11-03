class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> set1 = new HashSet<>();

        for(int n: nums1){
            set1.add(n);
        }

        Set<Integer> Intersection = new HashSet<>();

        for(int n : nums2){
            if(set1.contains(n)){
                Intersection.add(n);
            }
        }
        
        int[] Result = new int[Intersection.size()];
        int i =0;
        for(int num : Intersection){
            Result[i++] = num;
        }
       return Result;
    }
}