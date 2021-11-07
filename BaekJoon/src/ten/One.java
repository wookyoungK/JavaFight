package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class One {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		System.out.println(factory(num));
	}
	
	
	public static int factory(int num) {
		int sum = 1;
		if(num == 1 || num == 0) {
			return sum;
		}else {
			for(int i =1; i<=num; i++) {
				sum = sum*i;
			}
		}
		return sum;
	}

}
