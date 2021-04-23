
public class KthLargestNumber {

	public static void main(String[] args) {
     int[] arr= {30,1,34,50,29,46,54};
     int k=3;
     for(int i=0;i<k;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]<arr[j])
    		 {
    			 int temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
    	 if(i==k-1)
    	 {
    		 System.out.println(k+" largest number is: "+arr[i]);
    		 break;
    	 }
     }
	}

}
