package Leetcode周赛;

public class _5867 {

	public static void main(String[] args) {
		Solution5867 a = new Solution5867();
		System.out.println(a.reversePrefix("abcdefd", 'z'));
	}

}
class Solution5867 {
    public String reversePrefix(String word, char ch) {
    	char[] q = word.toCharArray();
    	int index = -1;
    	for(int i = 0; i < q.length; i ++) {
    		if(q[i] == ch) {
    			index = i;
    			break;
    		}
    	}
    	if(index == -1) return word;
    	for(int i = 0; i <= index / 2; i ++) {
    		char t = q[i]; q[i] = q[index - i]; q[index - i] = t;
    	}
    	String ans = "";
    	for(int i = 0; i < q.length; i ++) ans += q[i];
    	return ans;
    }
}