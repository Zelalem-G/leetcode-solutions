class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> setResult = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for(int n : nums2){
            if(set1.contains(n)){
                setResult.add(n);
            } 
        }

        int[] ans = new int[setResult.size()];
        int i = 0;
        for (int n : setResult) {
            ans[i++] = n;
        }

        return ans;
    }
}
