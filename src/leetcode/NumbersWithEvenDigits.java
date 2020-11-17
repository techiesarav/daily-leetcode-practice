package leetcode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
 * how many even number of digits in an array.
 * @author sramasamy7446
 *
 */
public class NumbersWithEvenDigits {

	class Solution {
	    public int findNumbers(int[] nums) {
	        int count =0;
	        for(int i=0;i<nums.length;i++){
	            int digitLength = (int)Math.floor(Math.log10(nums[i])+1);
	            if(digitLength %2 ==0){
	                count++;
	            }
	        }
	        return count;
	    }
	}
}
