//package practice;
//
//public class Queue {
//	private int[] arr;
//	private int front;
//	private int rear;
//	
//	public Queue(){
//		this.arr=new int[10];
//		this.front=-1;
//		this.rear=-1;
//	}
//	
//	public boolean isEmpty(){
//		if(front==-1|| rear==-1) return true;
//	     return false;
//		
//	}
//	public int size(int[] arr){
//		int sizeOfQueue=(rear-front);
//		return 0;
//		
//	}
//	public void enqueue(int x){
//		if(isEmpty()==true){
//			front=0;
//			rear=0;
//			arr[rear]=x;
//		}else if(isFull())
//			resize;
//		rear++;
//		arr[rear]=x;
//		}
//		
//	
//	private boolean isFull() {
//		if()
//		// TODO Auto-generated met hod stub
//		return false;
//	}
//
//	public void dequeue(){
//		if(isEmpty()==true){
//		}
//		front++;
//	}
//	public int peek(){
//		int peekValue;
//		if(isEmpty()==true){
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		else{
//		 peekValue=arr[front];
//			
//		}
//		return peekValue;
//		
//	}
//	
//	public String toString(){
//		StringBuffer str=new StringBuffer();
//		for(int i=front; i<=rear;i++){
//			str.append(arr[i]);
//			str.append(" ");
//		
//		}
//		return str.toString();
//	}
//	public static void main(String[] arg){
//		Queue q=new Queue();
//		System.out.println(q.isEmpty());
//		q.enqueue(7);
//		q.enqueue(8);
//		q.enqueue(88);
//		
//		System.out.println(q);
//		System.out.println(q.peek());
//		q.dequeue();
//	    System.out.println(q);
//		
//	}
//	
//	
//
//}
