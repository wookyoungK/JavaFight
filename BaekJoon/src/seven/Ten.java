package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(bf.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}

		System.out.println(count);
	}

	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		String str = bf.readLine();
		int prev = 0;

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}else {
					return false;
				}

			}else {
				continue;
			}

		}

		return true;
	}

}
