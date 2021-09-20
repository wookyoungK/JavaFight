package five.two;

import java.io.IOException;
import java.util.Scanner;

public class TwoBasic {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt() };
		in.close();

		int count = 0;
		int max = 0;
		int index = 0;

		for (int value : arr) {
			count++;

			if (value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);

	}

}
