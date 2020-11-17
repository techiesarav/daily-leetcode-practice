package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/discuss/interview-question/874127/amazon-oa2
 * @author sramasamy7446
 *
 */
public class SmallestNegativeBalance {

	 class DebtRecord
	{
	    String borrower = "";
	    String lender = "";
	    int amount = 0;
	    DebtRecord()
	    {
	        // empty constructor
	    }
	    DebtRecord(String borrower, String lender, int amount)
	    {
	        this.borrower = borrower;
	        this.lender = lender;
	        this.amount = amount;
	    }
	}
	 
	 public static List<String> findMinBalance(int numRows,int numCols,List<DebtRecord> debtRecords){
		 List<String> res = new ArrayList<>();
		 if(numRows == 0 || debtRecords == null) return new ArrayList<>();
	        HashMap<String, Integer> hm = new HashMap<>();
	        for(DebtRecord r: debtRecords) {
	            String b = r.borrower, l = r.lender;
	            int amount = r.amount;
	            hm.put(b, hm.getOrDefault(b, 0) - amount);
	            hm.put(l, hm.getOrDefault(l, 0) + amount);
	        }
	        
	        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
	            (a,b) -> a.getValue() == b. getValue() ? 
	            a.getKey().compareTo(b.getKey()) : 
	            a.getValue() - b.getValue());
	        
	        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
	            if(entry.getValue() < 0) {
	                pq.add(entry);
	            }
	        }
	        while(!pq.isEmpty()) {
	            res.add(pq.poll().getKey());
	        }
	        if(res.size() == 0) {
	            res.add("Nobody");
	        }
	        return res;
	 }
	 
	 public static void main(String[] args) {
		 SmallestNegativeBalance snb = new SmallestNegativeBalance();
		 List<DebtRecord> records = new ArrayList<>();
	        records.add(snb.new DebtRecord("Alex", "Blake", 2));
	        records.add(snb.new DebtRecord("Blake", "Alex", 2));
	        records.add(snb.new DebtRecord("Casey", "Alex", 5));
	        records.add(snb.new DebtRecord("Blake", "Casey", 7));
	        records.add(snb.new DebtRecord("Alex", "Blake", 4));
	        records.add(snb.new DebtRecord("Alex", "Casey", 4));
	        List<String> res = findMinBalance(6, 3, records);
	        for(String r: res) {
	            System.out.print(r+" ");
	        }
	        System.out.println();
	    }
}
