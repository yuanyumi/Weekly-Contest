package Leetcode周赛;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _5868 {

	public static void main(String[] args) {
		Solution5868 a = new Solution5868();
		int[][] r = {{4,2},{1,3},{4,1},{4,2},{2,4},{1,1},{1,1}};
		System.out.println(a.interchangeableRectangles(r));
	}

}
class Solution5868 {
    public long interchangeableRectangles(int[][] rectangles) {
    	Map<List<Integer>, Long> m = new HashMap<>();
    	for(int i = 0; i < rectangles.length; i ++) {
    		List<Integer> l = new ArrayList<>();
    		int a = rectangles[i][0], b = rectangles[i][1];
    		if(a < b) {
    			int t = a; a = b; b = t;
    		}
    		int yu = a % b;
    		while(yu != 0) {
    			a = b; b = yu;
    			yu = a % b;
    		}
			l.add(rectangles[i][0] / b);
    		l.add(rectangles[i][1] / b);
    		if(m.containsKey(l)) m.put(l, m.get(l) + 1); 
    		else m.put(l, (long) 1);
    	}
    	long ans = 0;
    	for(Long q : m.values()) ans += q * (q - 1) / 2;
    	return ans;
    }

}