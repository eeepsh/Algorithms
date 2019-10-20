package Lesson8Prog1;

public class MyStringLinkedList {
	Node header;
	int size;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		size++;
		
	}
	public Node getNode(int pos){
		if(pos>=size()) throw new IndexOutOfBoundsException();
		Node node= header;
		for(int i=0; i<size();i++){
			node.next=node;
			
		}
		return node;
	}
	public void insert(String data, int pos){
		if(pos<0 || data==null) return;
		if(pos>size()) throw new IndexOutOfBoundsException();
		Node n=getNode(pos);
		Node nodeBeforeN = getNode(pos-1);
		Node nodeToBeInserted = new Node(nodeBeforeN.next, nodeBeforeN, data);
		n.previous=nodeToBeInserted;
		nodeBeforeN.next=nodeToBeInserted;
		
	}

	private int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}
}

