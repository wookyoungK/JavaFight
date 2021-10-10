package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Four {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int A = Integer.parseInt(bf.readLine());
	StringBuilder sb = new StringBuilder();
	 
	for(int i=0; i<A; i++) {
		String[] str = bf.readLine().split(" ");
		
		int num = Integer.parseInt(str[0]);
		
		for(int j=0; j<str[1].length(); j++) {
			
			for(int k=0; k<num; k++) {				
				sb.append(str[1].charAt(j));
			}
		}
		sb.append("\n");
	
	}
	
	System.out.println(sb);
	}

}
