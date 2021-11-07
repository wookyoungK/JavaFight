package ten;

//피보나치 5 (Fibonacci numbers)
//11.08

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		System.out.println(fibonacci(num));
	}

	public static int fibonacci(int num) {
		int sum = 1;
		int temp = 1;
		int temp2 = 1;
		if (num == 2 || num == 1) {
			return sum;
		} else if (num == 0) {
			sum = 0;
		} else {
			for (int i = 3; i <= num; i++) {
				sum = temp2 + temp;
				temp2 = temp;
				temp = sum;
			}
		}
		return sum;
	}

}
