import java.util.Scanner;
public class LargestofNNumbers {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] a=takeInput();
		System.out.println(maximum(a));
  }
	public static int[] takeInput()
	{
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int maximum(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
