package linkedList;

public class Node<E> {
	Node next;
	E data;
	
	public Node(E data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return(this.next);
	}
	
	public E getData(){
		return this.data;
	}
	
	public String toString(){
		Node curr = this;
		StringBuffer buf = new StringBuffer();
		while(curr != null){
			buf.append(curr.data.toString() + " -> ");
			curr = curr.next;
		}
		return buf.toString();
	}
}
