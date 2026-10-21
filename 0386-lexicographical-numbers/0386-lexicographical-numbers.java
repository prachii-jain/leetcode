class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (i <= n) {
                solve(i, n, ans);
            }
        }
        return ans;
    }

    public void solve(int num, int n, List<Integer> ans) {
        if (num > n) {
            return;
        }
        ans.add(num);
        for (int i = 0; i <= 9; i++) {
            int next = num * 10 + i;
            if (next <= n) {
                solve(next, n, ans);
            }
        }
    }
}