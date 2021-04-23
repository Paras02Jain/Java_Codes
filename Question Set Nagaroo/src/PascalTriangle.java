import java.util.*;
import java.util.Scanner;
public class PascalTriangle {
   static int fact(int num) {
	int factorial;

	for(factorial = 1; num > 1; num--){
		factorial *= num;
	}
	return factorial;
    }
    static int ncr(int n,int r) {
	return fact(n) / ( fact(n-r) * fact(r) );
    }
    public static void main(String args[]){
	int n,row=0,nst=0;
	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
    while(row<n)
	{
       for(int col=0;col<=nst;col++)
         System.out.print(ncr(row, col)+" ");
    
	  System.out.println();
        row++;
        nst++;
    }
 	}
}
