package stackImplementation;

import linkedList.Node;

public class StackLL<E> {
	Node head = null;
	Node temp;
	
	/*public void push(E data){
		if(head == null){
			head = new Node(data);
			temp = top = head;
		}else{
			temp = new Node(data);
			top.setNext(temp);
			top = top.getNext();
			temp = head;
		}
	}
	public E pop(){ O(n) for pop
		E data;
		if(temp == null){
			System.out.println("POP CHECK-->Stack Empty");
			return null;
		}else if(temp == top){
			data = (E)temp.getData();
			temp = top = head = null;
			return data;
		}else{
			while(temp!=null && temp.getNext() != top){
				temp = temp.getNext();
			}
			data = (E)top.getData();
			top = temp;
			top.setNext(null);
			temp = head;
			return data;
		}
	}*/
	public E pop(){ // O(1) pop
		E data;
		if(head == null){
			System.out.println("POP CHECK-->Stack Empty");
			return null;
		}else{
			data = (E)head.getData();
			head = head.getNext();
			return data;
		}
	}	
	
	
	public void push(E data){
		if(head == null){
			head = new Node(data);
			head.setNext(null);
		}else{
			temp = new Node(data);
			temp.setNext(head);
			head = temp;
		}
	}
	
	public E top(){
		if(head == null){
			System.out.println("TOP Check--> Stack Empty");
			return null;
		}else return (E)head.getData();
	}

	public String toString(){
		Node node = head;
		while(node!=null){
			System.out.print(node.getData() + " --> " );
			node = node.getNext();
		}
		return null;
	}
}