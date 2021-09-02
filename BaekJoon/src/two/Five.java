package two;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M < 45 && H != 0) {
			System.out.println(H - 1 + " " + ((M + 60) - 45));
		} else if (M < 45 && H == 0) {
			System.out.println( 23 + " " + ((M + 60) - 45));
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
