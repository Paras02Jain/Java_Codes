package Prctc;

import java.util.Scanner;

public class SubArray {
	 static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
	     int[] a=takeInput();
//	      display(a);
	      subArrayPrint(a);
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
     public static void subArrayPrint(int[] arr)
     {
    	 for(int si=0;si<arr.length;si++)
    	 {
    		 for(int ei=si;ei<arr.length;ei++)
    		 {
    			 for(int k=si;k<=ei;k++)
    			 {
    				 System.out.print(arr[k]+" ");
    			 }
    			 System.out.println();
    		 }
    	 }
     }

}
