package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Four {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int count = 0;
		
		
		if(A >= C) {
			count = 1;
			System.out.println(count);
		}else {
			C = C - A;
			A = A - B;
			if(C%A == 0) {
				System.out.println(C/A + 1);
			}else {
				System.out.println(C/A +2);
			}
		}
		System.out.println();
		
	}
}
