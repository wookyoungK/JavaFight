package three.two;

import java.util.Scanner;

public class TwoBasic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[T];
		int total = 0;
		
		for(int i=0; i<T; i++) {
			int A= sc.nextInt();
			int B= sc.nextInt();
			arr[i] = A+B;
		}
		for (int k : arr) {
			System.out.println(k);
		};
	}

}
