package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

    long sum(int[] a) {
		long sum = 0;	// a 배열 정수 합 변수
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
