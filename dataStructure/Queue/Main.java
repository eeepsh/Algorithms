package dataStructure.Queue;

public class Main {

	public static void main(String[] args) {
		try {ArrayQueueImpl q = new ArrayQueueImpl();
	   // q.peek();
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
//		System.out.println(q);
	System.out.println(q.size());
		for(int i = 0; i < 13; i ++)
			
				q.dequeue();
				System.out.println("size of queue is "+q.size());
			} catch (QueueException qx) {
				qx.getStackTrace();
				System.out.println(qx.getMessage());
				
				// TODO: handle exception
			}
		

	}

}
