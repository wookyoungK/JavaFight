package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Three {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int T = 2;
		int count = 1;

		if (N == 1) {
			System.out.print("1/1");
		}

		else {
			while (true) {
				T++;
				if ((count + (T - 1)) >= N) {
					break;
				} else {
					count = count + (T - 1);
				}
			}

			if (T % 2 == 0) {
				System.out.println((T - ((N - count))) + "/" + (N - count));
			} else {
				System.out.println((N - count) + "/" + (T - ((N - count))));
			}

		}

	}
}
