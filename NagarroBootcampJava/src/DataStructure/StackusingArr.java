package DataStructure;

 class Stack {
	private int[] data;
	private int tos;
	public Stack() {
		data= new int[5];
		tos=-1;
	}
	public Stack(int cap) {
		data= new int[cap];
		tos=-1;
	}
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("stack is full");
		}
		tos++;
		data[tos]=item;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		int temp= data[tos];
		data[tos]=0;
		tos--;
	return temp;
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		int temp= data[tos];
		return temp;
	}
	
	public int size() {
		return tos+1;
	}
	public boolean isEmpty() {
		if(tos!=-1)
			return false;
		return true;
	}
	
	public boolean isFull() {
		return size()==data.length;
	}
	public void display() {
		for(int i=tos;i>=0;i--) {
			System.out.println(data[i]);
		}
	}
 }
public class StackusingArr{
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack obj= new Stack(6);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		System.out.println("--------");
		System.out.println(obj.peek());
		System.out.println("--------");
		obj.pop();
		System.out.println("--------");
		
		System.out.println(obj.isFull());
		System.out.println("--------");
		System.out.println(obj.isEmpty());
		obj.display();
	}
	
}
