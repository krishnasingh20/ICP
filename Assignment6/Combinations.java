class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(n, k, 1, ans, new ArrayList<>());
        return ans;
    }
    public void combination(int n, int k, int idx, List<List<Integer>> ans, List<Integer> ll) {
        if(ll.size() == k) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = idx; i <= n; i++) {
            ll.add(i);
            combination(n, k, i+1, ans, ll);
            ll.remove(ll.size()-1);
        }
    }
}
// TC--> O(k*(nCk)) where nCk = (n!/(k!*(n-k)!) (n choose k)
// SC--> O(k*(nCk))
