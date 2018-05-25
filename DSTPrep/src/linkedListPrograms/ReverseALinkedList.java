package linkedListPrograms;

import linkedList.Node;

public class ReverseALinkedList {

	public static void main(String[] args) {
		Node ll = new Node(1);
		Node head=ll;
		ll.setNext(new Node(2));
		ll = ll.getNext();
		ll.setNext(new Node(3));
		ll = ll.getNext();
		ll.setNext(new Node(4));
		System.out.println(head);
		System.out.println("Calling the Reverse LL code");
		reverseLL(head);
		
	}
	
	private static void reverseLL(Node head){
		Node prev = null;
		Node temp = null;
		while(head != null){
			temp = head.getNext();
			head.setNext(prev);	
			prev = head;
			head = temp;
		}
		System.out.println(prev);
	}

}
