class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        //  Map<Integer, Integer> map = new HashMap<>();

        // // Count frequency of nums1
        // for (int num : nums1) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // List<Integer> resultList = new ArrayList<>();

        // // Check nums2 against map
        // for (int num : nums2) {
        //     if (map.containsKey(num) && map.get(num) > 0) {
        //         resultList.add(num);
        //         map.put(num, map.get(num) - 1); // reduce count
        //     }
        // }

        // // Convert List to int[]
        // int[] result = new int[resultList.size()];
        // for (int i = 0; i < resultList.size(); i++) {
        //     result[i] = resultList.get(i);
        // }

        // return result;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> res = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++; j++;
            } else if (nums1[i] < nums2[j]) i++;
            else j++;
        }

        return res.stream().mapToInt(x -> x).toArray();

    }
}