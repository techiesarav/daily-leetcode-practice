package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomDataStructure {

	ArrayList<Integer> list;
	HashMap<Integer,Integer> map;
	int index;
	/** Initialize your data structure here. */
	public RandomDataStructure() {
	    list = new ArrayList<>();
	    map = new HashMap<>();
	    index=-1;
	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
	    if(map.get(val)==null)
	    {
	        list.add(val);
	        index++;
	        map.put(val,index);
	        return true;
	    }
	    return false;
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {
	    if(map.get(val)!=null)
	    {
	        int i=map.get(val);
	        int temp=list.get(list.size()-1);
	        list.set(i,temp);
	        list.remove(list.size()-1);
	        map.remove(val);
	        map.replace(temp,i);
	        index--;
	        return true;
	    }
	    return false;
	}

	/** Get a random element from the set. */
	public int getRandom() {
	    Random rand = new Random(); 
	    return list.get(rand.nextInt(list.size())); 
	}
	
	public static void main(String[] args) {
		RandomDataStructure obj = new RandomDataStructure();
		  boolean param_1 = obj.insert(2);
		   obj.insert(3);
		   obj.insert(4);
		   obj.insert(5);
		   obj.insert(6);
		  boolean param_2 = obj.remove(4);
		 int param_3 = obj.getRandom();
		 System.out.println(param_3);
	}
}
