package check;

public class Simple {
	static int count =1;
	public static void main(String[] args){
	 Object lock1 = new Object();
	 Object lock2 = new Object();
	 Simple s = new Simple();
	 A objA = s.new A();
	 B objB = s.new B();
	 objA.a = lock1;
	 objA.b = lock2;
	 objB.a = lock2;
	 objB.b = lock1;
	 new Thread(objA).start();
	 new Thread(objB).start();
	}
	
	class A implements Runnable{
		Object a;
		Object b;
		@Override
		public void run() {
			while(Simple.count <11) {
			synchronized(a) {
				System.out.println(Simple.count+" A");
				Simple.count ++;
				try {
					a.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized(b) {
				System.out.println("dummy A b");
				b.notify();
			}
			}
		}
	}
	
	class B implements Runnable{
		Object a;
		Object b;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(Simple.count <11) {
			synchronized(b) {
				System.out.println(Simple.count+" B");
				Simple.count++;
				b.notify();
			}
			synchronized(a) {
				try {
					System.out.println("dummy B a");
					a.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		}
	}

}
