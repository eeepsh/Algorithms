package dataStructure.doublyLinkedList;

public class DoublyLinkedList {

	Node header;
	int size=0;

	DoublyLinkedList() {
		header = new Node(null, null, null);
	}
	
	// add at fist position

		private void addAtFirst(String data) {
			
			if(header.next!=null){
				Node newNode=new Node(data, header.next, header);
				header.next.previous=newNode;
				
			}
			else{
				Node newNode=new Node(data, null, header);
				header.next=newNode;
				header=header.next;
				
			}
			// TODO Auto-generated method stub

		}


	// adds to the end of the list
	public void addLast(String item) {
		// implement

		if (header == null) {
			
			Node newNode = new Node(item, null, header);
			header.next = newNode;
			header = header.next;
		} else {
			Node currentNode = header;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node newNode = new Node(item, null, currentNode);
			currentNode.next = newNode;

		}

	}
	// Adding node on some position

	public void insert(String data, int pos) { {
		// Node header = n;
		if(data==null || pos==0){
			return;
		}else{
			Node previousNode=header.next;
			int count=0;
			if(pos==0){
				addAtFirst(data);
			}else{
				while(previousNode!=null){
					if(pos==count+1){
						Node nodeToBeInserted=new Node(data, previousNode.next, previousNode);
						if(previousNode!=null){
							previousNode.next.previous=nodeToBeInserted;
						}
						previousNode.next=nodeToBeInserted;
						size++;
						return;
					}
					previousNode=previousNode.next;
                    count++ ;					
					}
				}
			}
		}
		

	}
	public int size() {
		return size;
		
	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	




	class Node {
		String value;
		Node next;
		Node previous;

		public Node(String value, Node next, Node previous) {
			super();
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");

		 list.insert("Deepa", 1);
		System.out.println(list);
	}
}
