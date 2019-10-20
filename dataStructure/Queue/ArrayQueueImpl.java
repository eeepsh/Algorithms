package dataStructure.Queue;

import java.util.Arrays;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() throws QueueException{
		
		if(size()==0)throw new QueueException("Queue is empty");
		return (this.arr[front]);
		//implement
	}
	
	public void enqueue(int obj){
		if(rear==arr.length)
			resize();
		arr[rear]=obj;
		rear++;
		if(front==-1)
			front++;
		//implement
	}
	
	private void resize() {
		int[] arrayQ=new int[2*arr.length];
		System.arraycopy(arr, 0, arrayQ, 0, arr.length);
		arr=arrayQ;
		// TODO Auto-generated method stub
		
	}

	public int dequeue()throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is emptry");
		else return front++;
		//return -1;
		//implement
	}
	
	public boolean isEmpty(){
		if(size()==0)
			return true;
		//implement
		return false;
	}
	
	public int size(){
		if(front==-1){
		return (rear-front-1);
		}
		else
			return rear-front;
		//implement
		
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for(int i=front;i<rear;i++){
		  sb.append(arr[i]);
		  sb.append(" ");
		}
		return sb.toString();
		//return "ArrayQueueImpl [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	
}
