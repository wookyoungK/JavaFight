package ten;

//분할 정복 알고리즘

//11.10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Three {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int basicNum = num;
		if (num > 3) {
			num = num / 3;
		}
		System.out.println(num);
		division(num, basicNum);
	}

	public static void division(int num, int basicNum) {
		char arr[][] = new char[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i == 1 && j == 1) {
					arr[i][j] = ' ';
				} else {
					arr[i][j] = '*';
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
