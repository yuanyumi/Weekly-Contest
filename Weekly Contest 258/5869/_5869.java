package Leetcode周赛;

public class _5869 {

	public static void main(String[] args) {
		Solution5869 a = new Solution5869();
		System.out.println(a.maxProduct("accbcaxxcxx"));
	}

}
class Solution5869 {
	int ans;
    public int maxProduct(String s) {
    	ans = 1;
    	dfs(0,"","",s);
    	return ans;
    }

	private void dfs(int k, String s1, String s2, String s) {
		if(check(s1) && check(s2)) ans = Math.max(ans, s1.length() * s2.length());
		if(k >= s.length()) return;
		dfs(k + 1, s1, s2, s);
		dfs(k + 1, s1 + s.charAt(k), s2, s);
		dfs(k + 1, s1, s2 + s.charAt(k), s);
	}

	private boolean check(String s) {
		if(s.length() == 0) return false;
		for(int i = 0; i <= s.length() / 2; i ++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		return true;
	}
}