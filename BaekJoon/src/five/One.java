package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//EOF
public class One {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;

		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");

			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			sb.append(N + X).append("\n");
		}
		
		System.out.println(sb);

	}

}
