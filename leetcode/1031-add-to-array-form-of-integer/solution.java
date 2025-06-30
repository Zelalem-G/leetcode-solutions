class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int carry = 0;
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            int n = (i >= 0) ? num[i] : 0;
            int d = n + (k % 10) + carry;

            ans.addFirst(d % 10);
            carry = d / 10;

            k = k / 10;
            i--;
        }

        // if there's still a carry
        if (carry > 0) {
            ans.addFirst(carry);
        }

        return ans;
    }
}

