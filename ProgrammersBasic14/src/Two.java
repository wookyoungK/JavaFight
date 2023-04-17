import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Two fp = new Two();
        Scanner sc = new Scanner(System.in);
        int nm1 = sc.nextInt();
        int dm1 = sc.nextInt();
        int nm2 = sc.nextInt();
        int dm2 = sc.nextInt();
        System.out.println("분수의 덧셈 = " + fp.fountainPlus(nm1, dm1, nm2, dm2));
        /*
         * //배열 두배 만들기
         * int [] num = new int[4];
         * for (int i = 0 ; i < num.length; i++) {
         * num[i] = sc.nextInt();
         * }
         */
        sc.close();
    }

    // 분수의 덧셈
    public int[] fountainPlus(int numer1, int denom1, int numer2, int denom2) {
        int n = numer1 * numer2;
        int den = (denom1 * numer2) + (denom2 * numer1);
        int g = gcd(den, n);
        int[] answer = { den / g, n / g };
        return answer;
        /*
         * //방법 1
         * // 분자
         * int topNum = numer1 * denom2 + numer2 * denom1 ;
         * 
         * // 분모
         * int botNum = denom1 * denom2;
         * 
         * // 최소 공배수
         * int maximum = 1;
         * 
         * // 약분
         * for(int i = 1 ; i <= topNum ; i ++) {
         * if(topNum%i == 0 && botNum%i == 0) {
         * maximum = i;
         * }
         * }
         * int[] answer = {topNum/maximum, botNum/maximum};
         * 
         * return answer;
         */
    }

    private int gcd(int a, int b) {
        // 유클리드 호제법
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b > 1) {
            int r = a % b;
            if (r == 0)
                break;
            a = b;
            b = r;
        }
        return b;
    }

    // 배열 두배 만들기
    public int[] arrayMultiple(int[] numbers) {
        int[] answer = new int[numbers.length];
        if (numbers.length != 0) {
            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }
        }
        return answer;
    }
}