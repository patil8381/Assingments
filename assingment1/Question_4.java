package assingment1;
import java.util.Scanner;
//public class Question_4 {
//		public static void main(String[] args) {
//			System.out.println();
//		}
//}

public class Question_4 {
	public static void main(String args[]) {// opening of main
		Scanner sc = new Scanner(System.in);
		int n, i, j, a[][];
		// taking user's input.
		System.out.println("HOW MANY STEPS OF PASCAL TRIANGLE?");
		n = sc.nextInt();
		a = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++)
				System.out.print("1");
		}
		
	}
}
