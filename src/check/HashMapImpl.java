package check;

import java.io.IOException;

public class HashMapImpl{
	public static void main(String[] args) {
		try {
			throw new Exception("asdf");
		}catch(Exception ex) {
			System.out.println("`");
		}finally {
			System.out.println("3");
		}
	}
}
