import java.util.*;
public class HollowRhombusPattern {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int row=1;
      int nst=N,nsp=N-1;
      while(row<=N)
      {
          for(int col=1;col<=nsp;col++)
            System.out.print(" ");

          for(int j=1;j<=nst;j++)
          {
              if(j==1||j==N||row==1||row==N)
                   System.out.print("* ");
              else
                  System.out.print("  ");   
          } 
           System.out.println();
          row++;
          nsp=nsp-1;    
      }
    }
}
