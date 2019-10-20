package dataStructure.stackOperatons;


public class ArrayStackDLL {
	private Node top;
	private int size; // stack top;

	 ArrayStackDLL() // constructor
		{
			top = null; // create stack array
			size = 0; // no items in the stack
		}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return (top==null); // if top is null then true else false;
	}
	
	public void push(Object item){
		if(top==null){
			top=new Node(item, null, null);
			size++;
		}
		else{
			Node n= new Node(item, top, null);
			top.previous=n;
			size++;
		}
		
	}
	
	public Object pop(){
		Object temp=null;
		if(top==null){
			System.out.println("Stack is empty ");
			return null;
		}
		if (top != null) {
			temp = top.value;
			//top.next.previous = null;
			top = top.next;
			size--;
		}
		return temp;
	}

     public Object peek(){
    	 if(isEmpty()) return null;
    	 return top.value;
     }

	

	class Node {
		Object value;
		Node next;
		Node previous;

		public Node(Object value, Node next, Node previous) {

			this.value = value;
			this.next = next;
			this.previous = previous;
		}
		public String toString() {
			return value+" ";
		}

	}
	
	public String toString() {
		String str = "";
		Node temp = top;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	
	
	public static void main(String[] args) {
		ArrayStackDLL stk = new ArrayStackDLL(); // create stack of size 4
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push('D');
        System.out.println("Stack Elements : " + stk);
		System.out.println("size(): " + stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		 System.out.println("Stack Elements : " + stk);
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
		ArrayStackDLL stk1 = new ArrayStackDLL();
		stk1.push("Java");
		stk1.push(20);
	}

}
