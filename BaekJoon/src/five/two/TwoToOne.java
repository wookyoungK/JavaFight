package five.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoToOne {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		int arr []  = new int[9];
		int cnt = 0;
		int max =0;
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i]>max) {
			
				max = arr[i];
				cnt = i+1;
			}
		}
		System.out.println(max+"\n"+cnt);
		
		
		
		
		
	}
}
