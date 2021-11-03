package eight.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Nine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int X = Integer.parseInt(st.nextToken()); 
			int Y = Integer.parseInt(st.nextToken()); 
			
			if(X==0 && Y<=3) {
				sb.append(Y-X).append("\n");
			}else if(Y==4) {
				sb.append(3).append("\n");
			}
			else if(X==0 && Y>4) {
				int temp = Y-2;
				int num1 = temp/2;
				int num2 = temp%2;
				sb.append(num1 + num2 +2).append("\n");
			}else if(X>=1 && Y<=3) {
				sb.append(Y-X).append("\n");
			}else {
				int temp = Y-X-1;
				int num1 =temp/2;
				int num2 = temp%2;
				sb.append(num1 + num2 +1).append("\n");
			}
		}
			
		
		

		
		System.out.println(sb);
		
	}
}
