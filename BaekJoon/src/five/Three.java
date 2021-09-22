package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());

		int [] arr = new int[10];
		// 빈 배열 객체 생성시 0으로 초기값 할
		
		
		int total = A*B*C;
		//tostring, valueof 차이 찾아보
		String str = String.valueOf(total);
		
		//문자열 코드를보면 알수있음 찾아보
		for(int i=0; i<str.length(); i++ ) {
			
			arr[(str.charAt(i)-48)]++;
			
		}
		//향상된 for문 
		for(int j : arr) {
			System.out.println(j);
		}
		
	}

}
