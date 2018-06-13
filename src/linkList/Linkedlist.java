package linkList;

public class Linkedlist {

	public static Node head;
	
	static class Node{
		
		int data;
		Node next;
	
		public Node(int d) {
			data = d;
			next = null;
		}
	} // Node
	
	// push element in front of the linked list
	public void push(int newData) {
		Node temp = new Node(newData);
		temp.next = head;
		head  = temp;
	} // push
	
	// reverse linked list
	public void reverseLL() {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next; 
		}
		
		//n = prev;
		
	} // reverseLL
	
	public void printList() {
		Node last = head;
		while(last != null) {
			System.out.print(last.data +  " -> " );
			last = last.next;
		}
		System.out.println();
	}
} //Linkedlist
