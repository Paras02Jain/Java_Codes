package Prctc;

public class WaveDisplay {

	public static void main(String[] args) {
		int[][] a= {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
        display(a);
        System.out.print("WAVEDISPLAY: ");
        waveDisplay(a);
	}
	public static void display(int[][] arr)
    {
    	for(int[] val:arr)
    	{
    		for(int val1:val)
    		{
    		System.out.print(val1+" ");
    		}
    	System.out.println();
    	}
    }
	public static void waveDisplay(int[][] arr)
	{
		for(int c=0;c<arr[0].length;c++)
		{
			if(c%2==0)
			{
				for(int r=0;r<arr.length;r++)
				{
					System.out.print(arr[r][c]+" ");
				}
			}
			else
			{
				for(int r=arr.length-1;r>=0;r--)
				{
					System.out.print(arr[r][c]+" ");
				}
			}
		}
		System.out.println();
	}

}
