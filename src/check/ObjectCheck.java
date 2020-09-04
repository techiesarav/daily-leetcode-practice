package check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
	String name;
	
	int age;
	
	Employee(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class ObjectCheck {

	public static void main(String[] args) {
		Employee e1 = new Employee("sarav",23);
		Map<String,Integer> sampleMap = new HashMap<String,Integer>();
		sampleMap.put(e1.name, e1.age);
		e1.setName("indu");
		System.out.println(sampleMap.get("sarav"));
		List<Integer> al = new ArrayList<>(1);
		al.add(4);
		al.add(5);
		
	}
}
