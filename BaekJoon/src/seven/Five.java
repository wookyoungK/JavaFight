package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		String str = bf.readLine();
		str =str.toUpperCase();
		int max = -1;
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++;

		}
		char ch = '?';
		for (int i = 0; i < 26; i++) {

			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
				
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
