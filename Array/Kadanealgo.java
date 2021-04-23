package Prctc;

import java.util.Scanner;

public class Kadanealgo {
	static Scanner sc=new Scanner(System.in);
			public static void main(String[] args) {
		 int[] a=takeInput();
//		 display(a);
//		 int[] res=inverse(a);
//		 display(res);
		 
//		 kadane(a);
//		 System.out.println(circularArrayMaxSubarraySum(a));
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
			public static int kadane(int[] arr)
			{
				int sum=arr[0];
				int max=arr[0];
				for(int i=1;i<arr.length;i++)
				{
					sum=Math.max(sum+arr[i], arr[i]);
					if(sum>max)
					  max=sum;
				}
				return max;
			}
            public static int circularArrayMaxSubarraySum(int[] arr1)
            {
            	int ceNonWrapping=kadane(arr1);  // CASE 1: Contributing elemnts are not wrapping
            	int totalSum=0;                  // CASE 2: Contributing elemnts are wrapping
            	for(int i=0;i<arr1.length;i++)
            	{
            		totalSum+=arr1[i];
            		arr1[i]=-arr1[i];
            	}
            	int nonContributingSum=kadane(arr1);
            	int ceWrapping=totalSum+nonContributingSum;
            	return Math.max(ceNonWrapping, ceWrapping);
            }
           public static int[] inverse(int[] arr2)
           {
        	   int res[]=new int[arr2.length];
        	   for(int i=0;i<res.length;i++)
        		   res[arr2[i]]=i;
        	   return res;
           }
           public static void display(int[] arr)
           {
        	   for(int val:arr)
        		   System.out.print(val+" ");
           }
}
