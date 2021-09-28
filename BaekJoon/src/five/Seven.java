package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Seven {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int [] arr; 		
		StringTokenizer st;
		
		for(int i=0; i<A; i++) {
			double sum = 0;
			double avg = 0;
			st = new StringTokenizer(bf.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			avg = (sum/N);
			double cnt =0;
			
			
			for(int k=0; k<N; N++) {
				if(arr[k] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
		
	}

}
