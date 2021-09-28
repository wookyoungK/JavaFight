package five.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SixToOne {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String [] arr = new String[A];
		for(int i=0; i<arr.length; i++ ) {
			
			int cnt =0;
			int sum =0;
			
			st = new StringTokenizer(bf.readLine());
			arr[i] =st.nextToken();
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
					sum += cnt;
				}else {					
					cnt = 0;
				}
				
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}

}
