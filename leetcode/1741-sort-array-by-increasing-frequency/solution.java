class Solution {
    public int[] frequencySort(int[] nums) {
        int offset = 100; 
        int[] freq = new int[201]; 

        for (int num : nums) {
            freq[num + offset]++;
        }

        int n = nums.length;
        List<Integer>[] buckets = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = -100; i <= 100; i++) {
            int f = freq[i + offset];
            if (f > 0) {
                buckets[f].add(i); 
            }
        }

        int idx = 0;
        for (int f = 1; f <= n; f++) { 
            if (buckets[f].size() > 0) {
                buckets[f].sort((a, b) -> b - a); 
                for (int num : buckets[f]) {
                    for (int j = 0; j < f; j++) {
                        nums[idx++] = num;
                    }
                }
            }
        }

        return nums;
    }
}

