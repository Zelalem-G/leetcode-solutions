import java.util.*;

class Solution {
    public List<List<Integer>> generate(int g) {
        List<List<Integer>> ans = new ArrayList<>();

        if (g <= 0) return ans;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);

        for (int n = 1; n < g; n++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = ans.get(n - 1);

            for (int i = 0; i <= n; i++) {
                if (i == 0 || i == n) {
                    row.add(1); 
                } else {
                    row.add(prev.get(i - 1) + prev.get(i));
                }
            }

            ans.add(row);
        }

        return ans;
    }
}

