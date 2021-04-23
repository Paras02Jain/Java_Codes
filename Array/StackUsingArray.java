package Prctc;

public class StackUsingArray {
	public static void main(String[] args) throws Exception
	{
      Stack s=new Stack(6);
      s.push(10);
      s.push(20);
      s.push(30);
      s.display();
      System.out.println("--------");
      System.out.println(s.peek());
      System.out.println("--------");
      s.pop();
      System.out.println("--------");
      s.display();
      s.push(50);
      System.out.println("--------");
      s.display();
	}

}
 class Stack{
	private int[] data;
	private int tos;
	
	public Stack()
	{
		data=new int[5];
		tos=-1;
	}
	public Stack(int cap)
	{
		data=new int[cap];
		tos=-1;
	}
	public void push(int item) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack is Full");
		}
		tos++;
		data[tos]=item;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int temp=data[tos];
		data[tos]=0;
		tos--;
		return temp;
	}
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int temp=data[tos];
		return temp;
	}
	public int size()
	{
		return tos+1;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public boolean isFull()
	{
		return size()==data.length;
	}
	public void display()
	{
		for(int i=0;i<=tos;i++)
			System.out.print(data[i]+" ");
		System.out.println();
	}
}
