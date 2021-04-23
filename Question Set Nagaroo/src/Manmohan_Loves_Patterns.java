import java.util.Scanner;

public class Manmohan_Loves_Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=1;
		while(row<=n)
		{
			for(int col=1;col<=nst;col++)
			{
				if(row==1)
					System.out.print(row);
				else
					if(col==1||col==nst)
						System.out.print(row-1);
					else
						System.out.print("0");
			}
			System.out.println();
		  row++;
		  nst++;
		}
	}

}
