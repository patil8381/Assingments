package assingment1;
import java.util.Scanner;
public class Question_4Pascal {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("how many line pascal triangle u want: ");
	int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print("");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
       }
  }
}