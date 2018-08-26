public class LinkedList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void afterAdd(Node previous,int newNodeData) {
		
		if(previous == null) {
			System.out.println("Previous noda cannot be empty");
			return;
		}
		
		Node newNode = new Node(newNodeData);
		
		newNode.next = previous.next;
		previous.next = newNode;
		
	}
	
	void printList(LinkedList list) {
		if(list.head == null) {
			return;
		}
		
		Node iterate = head;
		while(iterate != null) {
			System.out.println(iterate.data);
			iterate = iterate.next;
			
		}
	}
	
	void  push(int nodeValue) {
		if(head == null) {
			return;
		}
		
		Node newNode = new Node(nodeValue);
		newNode.next = head;
		head = newNode;
	}
	
	void append(int nodeValue) {
		if(head == null) {
			return;
		}
		
		Node last = head;
		while(last.next != null)
			last = last.next;
		Node newNode = new Node(nodeValue);
		
		newNode.next = null;
		last.next = newNode;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head =  new Node(5);
		Node two = new Node(6);
		Node three = new Node(7);
		ll.head.next = two;
		two.next = three;
		three.next = null;
		ll.push(1);
		ll.afterAdd(two, 66);
		ll.append(88);
		ll.printList(ll);
		
	}
	
}