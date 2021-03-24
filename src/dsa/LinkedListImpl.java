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
	
	public void delete(int key) {
		int pos = search(key);
		if(pos ==-1) {
			return;
		}
		if(pos ==0) {
			head =head.next;
		}
		Node cur = head;
		for(int i=0;i<pos-1;i++) {
			cur=cur.next;
		}
		Node temp = cur.next;
		cur.next = temp.next;
//		temp.next =null;
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
	
	public void reverse() {
		reverseLinkedList(head);
	}
	
	private Node reverseLinkedList(Node head) {
		if(head ==null)
			return head;
		if(head.next == null)
			return head;
		Node newHeadNode = reverseLinkedList(head.next);
		 // change references for middle chain 
        head.next.next = head; 
        head.next = null; 
  
        // send back new head node in every recursion 
        return newHeadNode;
		
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
//		ls.delete(2);
//		ls.insert(6,2);
		ls.reverse();
		ls.print();
//		System.out.println("key 2 is at position "+ ls.search(2));
	}

}
