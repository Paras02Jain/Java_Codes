import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int row=1;
	 int val;
	 int nst=1,nsp=n-1;
	 while(row<=n)
	 {
		 val=row;
		 for(int col=1;col<=nsp;col++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=nst;j++)
		 {
			 System.out.print(val);
			  if(j<=nst/2)
				  val++;
			  else
				  val--;
		 }
		 System.out.println();
		 row++;
		 nsp=nsp-1;
		 nst=nst+2;
	 }
	}

}
