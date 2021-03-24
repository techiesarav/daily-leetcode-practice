package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

enum enums{
	
}
class Employee{
	String name;
	
	Integer age;
	
	Employee(String name,int age){
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

public class ObjectCheck {
	
	public ObjectCheck(){
		
	}
	
	public static void checkObjArgs(Object... params) {
		List<Object> al = Arrays.stream((Object[]) params).collect(Collectors.toList());
		Object[] as = al.toArray(new Object[0]);
		System.out.println(true);
	}
	
	static void Display(Object ob){
		System.out.println("ob");
	}
	
	static void Display(String ob){
		TreeSet<Mon> se = new TreeSet<>();
		System.out.println("obs");
	}
	static class Mon{
		Mon(int i){
		}
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("sarav",23);
		Employee e2 = new Employee("ind",21);
		List<Employee> el = new ArrayList<>();
		el.add(e1);
		el.add(e2);
		el.forEach(e ->{
			if(e.getName().equals("ind")) {
				e.setAge(22);
			}
		});
		el.set(1, new Employee("uma",22));
		el.forEach(e->{
			System.out.println(e.getName()+" "+e.getAge());
		});
		
		String str = "mon,thu";
		Pattern pattern = Pattern.compile("((?i)(mon|tue|wed))(,(?i)(mon|tue|wed))*");
		Matcher matcher =pattern.matcher(str);
		System.out.println(matcher.matches());
		List<String> errors = Collections.<String>emptyList();
		List<String>er = new ArrayList<>();
		er.add("sd");
//		errors.addAll(er);
		Display(null);
		Map<String,Integer> sampleMap = new HashMap<String,Integer>();
		sampleMap.put(e1.name, e1.age);
		e1.setName(null);
		String[] s12 = {"abc","tre"};
		System.out.println(String.valueOf(s12));
		System.out.println(sampleMap.get("sarav"));
		List<Integer> al = new ArrayList<>(1);
		al.add(4);
		al.add(5);
		Double d1 = 1231425324543534523454323452345234512345D;
		System.out.println(String.valueOf(d1));
		//checkObjArgs(12,"one","check",12L);
//		Employee e2 = null;
		if(Objects.nonNull(e2) && e2.getAge()!=null) {
			System.out.println("true");
		}
		System.out.println("false");
//		ObjectCheck o1 = ObjectCheck();
//		lead l = o1.new lead();
		
	}

}


class lead{
	static void sd() {
		
	}
}

class folower extends lead{
	static void sd() {
		
	}
}
