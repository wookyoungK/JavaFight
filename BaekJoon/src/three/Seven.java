package three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Seven {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
//		String str = br.readLine();
		StringTokenizer st;

		for (int i = 0; i < A; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #"+(i+1)+":" + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		
		bw.flush();
		bw.close();

	}

}
