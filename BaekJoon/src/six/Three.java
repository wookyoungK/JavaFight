package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 등차 수열
// 한
/*
등차수열(arithmetic sequence). 즉 연속하는 두 항의 차이가 모두 일정한 수열을 의미한다.

예로들면 [ 1, 1, 1, 1, 1 ] , [ 1, 2, 3, 4, 5 ] , [ 1, 3, 5, 7 ,9 ] 등이 있다.

 
등차수열을 일반 항으로 나타낸다면 아래와 같다.


즉 두 항의 차이를 d 라고 할 때, n 번째 항은 초항과 (n-1) * d 의 합과 같다는 것이다.

우리가 풀 문제는 각 자리수가 등차수열을 이루고 있는지를 검사하는 문제다.

근데 잘 보면 1 ~ 1000 까지의 수 중 검사할 수는 100~1000 까지 밖에 없다.
 

생각해보자. 1 ~ 99 는 모두 등차 수열이다.

1 ~ 9 는 수가 하나 그 자체로 수열에 속한다.


10 ~ 99 또한 각 자리수의 차가 공차이고 그 수 자체로 수열을 이룬다.

예로들면 31 은 공차가 -2 인 수열이고, 38 은 공차가 5 인 수열이다.

그러면 우리가 알고리즘을 짤 때 생각해야 할 것은 1000 보다 작은 수와 100 보다 큰 수의 케이스를 나누어 생각하면 되겠다.
*/

public class Three {

	public static void main(String[] args) throws NumberFormatException, IOException { // 메인
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());

		System.out.println(arithmetic_sequence(A));
	}

	public static int arithmetic_sequence(int number) { // 함수
		int cnt = 0;
		if(number <100) {
			return number;
		}else {
			cnt = 99;
			if(number == 1000) {
				number = 999;
			}
			
			
			for(int i=100; i<=number; i++) {
				int one = i%10;
				int two = (i/10)%10;
				int hen = i/100;		
				
				int d = two - one;
				if( d == (hen-two) ) {
					cnt++;
				}
			}
			
		}
		
		return cnt;
	}
}