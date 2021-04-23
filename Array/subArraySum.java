package Prctc;

import java.util.Scanner;

public class subArraySum {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] a=takeInput();
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
//	    public static void display(int[] arr)
//	    {
//	    	for(int val:arr)
//	    		System.out.print(val+" ");
//	    	System.out.println();
//	    }
	     public static void subArrayPrint(int[] arr)
	     {
	    	 for(int si=0;si<arr.length;si++)
	    	 {
	    		 for(int ei=si;ei<arr.length;ei++)
	    		 {
	    			 int sum=0;
	    			 for(int k=si;k<=ei;k++)
	    			 {
	    				 sum=sum+arr[k];
	    			 }
	    			 System.out.println(sum);
	    		 }
	    	 }
	     }
}
