package three.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeToOne {

	public static void main(String[] args) throws IOException {
 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());
		int total = 0;

		for (int i = 0; i <= A; i++)
			total += i;
		System.out.println(total);

	}
}
