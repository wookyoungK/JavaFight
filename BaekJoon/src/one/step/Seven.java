package one.step;
//두 수를 입력받고 합을 출력하는 문제
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A > 0 && B <10) {
			System.out.println((double)A/B);
		}
	}

}
