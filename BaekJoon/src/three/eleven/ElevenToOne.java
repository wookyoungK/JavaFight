package three.eleven;

import java.io.IOException;
import java.util.Scanner;

public class ElevenToOne {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		int arr [] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<N; i++) {
			if(arr[i] < T) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
