package Prctc;

import java.util.Scanner;

public class InverseArray {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
     int[] a=takeInput();
      display(a);
      int[] res=inverse(a);
      display(res);
      
	}
	public static int[] takeInput()
	{
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		  arr[i]=sc.nextInt();
		return arr;
	}
    public static void display(int[] arr)
    {
    	for(int val:arr)
    		System.out.print(val+" ");
    	System.out.println();
    }

    public static int[] inverse(int[] arr)
    {
    	int[] res=new int[arr.length];
    	for(int i=0;i<res.length;i++)
    	{
    		res[arr[i]]=i;
    	}
    	return res;
    }
    
    
}
