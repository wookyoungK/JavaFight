package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Five {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int A = Integer.parseInt(bf.readLine());

		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		double max = 0;
		double total = 0;
		
		double [] arr = new double[A];
		for(int i=0; i<arr.length; i++ ) {
			// 여기서 이런식이면 엔터를 기준으로 3번 짜른다 
			// 그러므로 10 20 30 \n 20 30 40 \n 20 30 40 으로된다.
			
			arr[i] =Double.parseDouble(st.nextToken());
			
			if(max < arr[i]) {
				max = arr[i];
			}
				
		}
		
		for(int i=0; i<arr.length; i++) {
			total += (arr[i]/max)*100;
		}
		System.out.print( total/arr.length );
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		double arr[] = new double[Integer.parseInt(br.readLine())];
//        
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		for(int i =0; i < arr.length; i++) {
//			arr[i] = Double.parseDouble(st.nextToken());
//		}
//		
//		double sum = 0;
//		Arrays.sort(arr);
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += ( (arr[i] / arr[arr.length-1])*100 );
//			System.out.println(sum);
//		}
//		System.out.print( sum/arr.length );
	}

}
