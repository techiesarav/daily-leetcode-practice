package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input and output
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28  
 * @author sramasamy7446
 *
 */
public class ExcelSheetColumn {
	
	 public static int titleToNumber(String s) {
	        int len = s.length();
	        int sum =0;
	        if(len ==1) {
	        	sum = s.charAt(0) - 64;
	        }else {
	        for(int i=0;i<len-1;i++){
	            int j = s.charAt(0) - 64;
	            sum =sum+(j*26);
	        }
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
	}

}
