package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int A = Integer.parseInt(bf.readLine());
	String B = bf.readLine();
	int sum = 0;
	
	for(int i=0; i<A; i++) {
		sum += (B.charAt(i) - '0');
			
	}
	System.out.println(sum);
		
		
	}

}
