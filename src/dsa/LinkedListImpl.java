package dsa;

class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;
	
	public void insert(int data) {
		Node temp = new Node();
		temp.data = data;
		if(head == null)
			head = temp;
		else {
			Node cur = head;
			while(cur.next !=null) {
				cur = cur.next;
			}
			cur.next = temp;
		}
	}
	
	public void insert(int data,int position) {
	  Node temp = new Node();
	  temp.data = data;
	  if(head ==null) {
		  temp.next = head;
		  head = temp;
	  }else {
		  Node cur = head;
		  for(int i=0;i<position-1;i++) {
			  cur = cur.next;
		  }
		  temp.next = cur.next;
		  cur.next = temp;
	  }
	}
	
	public int search(int key) {
		int pos = 0;
		if(head == null)
			return -1;
		else {
			Node cur = head;
			while(cur !=null) {
				if(cur.data == key)
					return pos;
				cur =cur.next;
				pos++;
			}
		}
		return pos;
	}
	
	public void print() {
		Node cur = head;
		while(cur !=null) {
			System.out.print(cur.data+ " ->");
			cur = cur.next;
		}
		System.out.print("null");
		System.out.print("\n");
	}
}

public class LinkedListImpl {
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.insert(1);
		ls.insert(2);
		ls.insert(3);
		ls.insert(4);
		ls.insert(5);
		ls.insert(6,2);
		ls.print();
		System.out.println("key 2 is at position "+ ls.search(2));
	}

}
