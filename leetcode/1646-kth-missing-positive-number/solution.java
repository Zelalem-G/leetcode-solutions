class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, e = 1;
        int c = arr[l] - 1; 

        if (c >= k) {
            return k;
        }

        while (e < arr.length) {
            int r = arr[e] - arr[l] - 1; 

            if (c + r >= k) {
                return arr[l] + (k - c); 
            } else {
                c += r;
                l++;
                e++;
            }
        }

        return arr[arr.length - 1] + (k - c);
    }
}

