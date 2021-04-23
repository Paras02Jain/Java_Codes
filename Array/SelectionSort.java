package Prctc;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {38,52,3,10,50,43,5};
		int min,temp=0;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
        for(int i=0;i<arr.length;i++)
        	System.out.print(arr[i]+" ");
	}

}
