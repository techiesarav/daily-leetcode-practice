package leetcode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/find-the-town-judge/
 * simple array prob
 * @author sramasamy7446
 *
 */
public class TownJudge {
	
	
	  public static int findJudge(int N, int[][] trust) {
	        int len = trust.length;
	        int counter[] = new int[N+1];
	        for(int i=0;i<len;i++){
	            int x = trust[i][0];
	            int y = trust[i][1];
	            counter[x] =  counter[x]-1;
	            counter[y] =counter[y]+1;
	        }
	        
	        for(int i=1;i<=N;i++){
	            if(counter[i] ==N-1){
	                return counter[i];
	            }
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		int[][] trust = {{1,2}};
		LinkedList<Integer> al  = new LinkedList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al.remove());
		System.out.println(findJudge(2,trust));
	}

}
