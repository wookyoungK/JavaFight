package three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ten {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0; i<T; i++) {
			for(int j=T; j>0; j--) {
				if(i>=j-1) {
					bw.write("*");
				}else {					
					bw.write("|");
				}
			}
			bw.write("\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
