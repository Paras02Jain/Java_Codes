package Prctc;

public class CircularQueueUsingArray {

	public static void main(String[] args) throws Exception
	{
		Queue q=new Queue(10);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		 q.display();
		    System.out.println("--------");
		    q.dequeue();
		    q.dequeue();
		    System.out.println("--------");
		    q.display();
		    System.out.println("--------");
		    q.enqueue(60);
		    q.enqueue(70);
		    System.out.println("--------");
		    q.display();
		    System.out.println("--------");
		    System.out.println(q.isEmpty());
		    System.out.println("--------");
		    System.out.println(q.isFull());
		    System.out.println("--------");
	}
}
class CircularQueue
{
	private int[] data;
	private int front;
	private int size;
	public CircularQueue()
	{
		data=new int[5];
		front=0;
		size=0;
	}
	public CircularQueue(int cap)
	{
		data=new int[cap];
		front=0;
		size=0;
	}
	public void enqueue(int item) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue is Full");
		}
		int idx=(front+size)%data.length;
		data[idx]=item;
		size++;
	}
	public int dequeue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		data[front]=0;
		front=(front+1)%data.length;
		size--;
		return temp;
	}
	public int getFront() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}	
		int temp=data[front];
		return temp;
	}
	public int size()
	{
		return size;
	}
	public boolean isFull()
	{
		return size()==data.length;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public void display() {
	    for(int i=0;i<size;i++) {
	      int idx= (i+front)%data.length;
	      System.out.println(data[idx]);
	    }
	  }
}
