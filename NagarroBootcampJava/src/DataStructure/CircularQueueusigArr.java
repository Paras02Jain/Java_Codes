package DataStructure;

class CQueue{
	private int[] data;
	private int front;
	private int rear;
	
	public CQueue() {
		data= new int[5];
		front=0;
		rear=0;
	}
	public CQueue(int cap) {
		data= new int[cap];
		front=0;
		rear=0;
	}
	
	public void enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception(" queue is full");
		}
		int idx= (front+ rear)%data.length;
		data[idx]=item;
		rear++;
		
	}
	
	public int dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		int temp= data[front];
		data[front]=0;
		front=(front+1)%data.length;
		rear--;
		
		return temp;
	}
	
	public int peek()throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		int temp= data[front];
		return  temp;
	}
	
	public int size() {
		return rear;
	}
	
	public boolean  isEmpty() {
	 return size()==0;
		
	}
	
	public boolean isFull() {
		return size()==data.length;
	}
	
	public void display() {
		for(int i=0;i<size();i++) {
			int index= (i+front)%data.length;
			System.out.println(data[index]);
		}
	}
}
public class CircularQueueusigArr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CQueue q= new CQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println("--------");
		q.dequeue();
		q.display();
		System.out.println("--------");
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		System.out.println("--------");
		System.out.println(q.isEmpty());
		System.out.println("--------");
		System.out.println(q.isFull());
		System.out.println("--------");

	}

}
