package five.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//EOF
public class One {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int max = -1000001;
		int min = 1000001;
		
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val > max) {
				max = val;
			}
			
			if(val < min) {
				min = val;
			}
			
		}
		System.out.println(min + " " + max);

	}

}
