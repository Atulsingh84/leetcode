class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> intersectionSet = new HashSet<>();
        
        // 2. Use two pointers to iterate through both arrays
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // nums1's element is smaller, move its pointer
                i++;
            } else if (nums1[i] > nums2[j]) {
                // nums2's element is smaller, move its pointer
                j++;
            } else {
                // They are equal! This is an intersection.
                intersectionSet.add(nums1[i]);
                // Move both pointers
                i++;
                j++;
            }
        }
        
        // 3. Convert the set to an array
        int[] result = new int[intersectionSet.size()];
        int k = 0;
        for (int num : intersectionSet) {
            result[k] = num;
            k++;
        }
        
        return result;

    }
}