package six;
// 셀프 함수 
public class Two {

	public static void main(String[] args) { // 메인
		boolean check[] = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				check[n] = true;
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);

	}

	public static int d(int number) { // 함수
		int sum = number;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}

		return sum;
	}
}