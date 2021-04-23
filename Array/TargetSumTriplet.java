package Prctc;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {
    static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
    int[] a=takeInput();
    targetSumTriplet(a,100);
	}
	public static int[] takeInput()
	{
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		  arr[i]=sc.nextInt();
		return arr;
	}
	public static void targetSumTriplet(int[] arr,int target)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
	 {
	     int j=i+1;
		int k=arr.length-1;
		while(j<k)
		{
			if(arr[j]+arr[k]>target-arr[i])
				k--;
			else if(arr[j]+arr[k]<target-arr[i])
				j++;
			else
			{
				System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
				j++;
				k--;
			}
		}
	 }
		
	}
	
}
