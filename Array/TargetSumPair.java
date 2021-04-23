package Prctc;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] a=takeInput();
		targetSumPair(a,100);
	}
	public static int[] takeInput()
	{
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		  arr[i]=sc.nextInt();
		return arr;
	}
	public static void targetSumPair(int[] arr,int target)
	{
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]<target)
			   i++;
			else if(arr[i]+arr[j]>target)
				j--;
			else {
				System.out.println(arr[i]+" "+arr[j]);
				i++;
				j--;
			}
		}
	}

}
