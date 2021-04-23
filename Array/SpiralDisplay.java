package Prctc;

public class SpiralDisplay {

	public static void main(String[] args) {
		int[][] a= {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
        display(a);
        System.out.print("SPIRALDISPLAY: ");
        spiralDisplay(a);
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
	public static void spiralDisplay(int[][] arr)
	{
		int minRow=0;
		int maxRow=arr.length-1;
		int minCol=0;
		int maxCol=arr[0].length-1;
		int nle=arr.length*arr[0].length;
		int count=0;
		while(count<nle)
		{
		for(int r=minRow;r<=maxRow&&count<nle;r++)
		{
			System.out.print(arr[r][minCol]+" ");
			count++;
		}
		minCol++;
		for(int c=minCol;c<=maxCol&&count<nle;c++)
		{
			System.out.print(arr[maxRow][c]+" ");
			count++;

		}
		maxRow--;
		for(int r=maxRow;r>=minRow&&count<nle;r--)
		{
			System.out.print(arr[r][maxCol]+" ");
			count++;

		}
		maxCol--;
		for(int c=maxCol;c>=minCol&&count<nle;c--)
		{
			System.out.print(arr[minRow][c]+" ");
			count++;

		}
		minRow++;
		}
	}

}
