package Prctc;

public class SimpleQueueUsingArray {

	public static void main(String[] args) throws Exception
	{
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		 q.display();
		    System.out.println("--------");
		    q.dequeue();
		    q.dequeue();
		    System.out.println("--------");
		    q.display();
		    System.out.println("--------");
		    System.out.println(q.isEmpty());
		    System.out.println("--------");
		    System.out.println(q.isFull());
		    System.out.println("--------");
	}
}
class Queue
{
	public int[] data;
	int front;
	int size;
	
	public Queue()
	{
		data=new int[5];
		front=0;
		size=0;
	}
	public Queue(int cap)
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
		int idx=front+size;
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
		front=front+1;
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
	    for(int i=0;i<size();i++) {
	      int idx= (i+front);
	      System.out.println(data[idx]);
	    }
	  }
}
