import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight {
    public static void main(String[] args) {
        Eight sol = new Eight();
        System.out.println("안전 지대 = " + sol.safety());
        System.out.println("유한소수 판별하기 = " + sol.decimal());

    }

    // 안전 지대
    public int safety() {
        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        int answer = 0;
        boolean landmine[][] = new boolean[board.length][board.length];

        for (int row = 0; row < landmine.length; row++) {
            for (int col = 0; col < landmine.length; col++) {
                if (board[row][col] == 1)
                    Destroy(col, row, board.length, landmine);
            }
        }

        for (int i = 0; i < landmine.length; i++) {
            for (int j = 0; j < landmine.length; j++) {
                if (landmine[i][j] == false)
                    answer++;
            }
        }

        return answer;
    }

    private static void Destroy(int col, int row, int n, boolean[][] landmine) {
        for (int r = row - 1; r < row + 2; r++) {
            if (r < 0 || r >= n)
                continue;
            else {
                for (int c = col - 1; c < col + 2; c++) {
                    if (c < 0 || c >= n)
                        continue;
                    else
                        landmine[r][c] = true;
                }
            }
        }
    }

    // 유한소수 판별하기
    public int decimal() {
        int a = 12;
        int b = 20;
        int num2 = b;
        int answer = 1;

        // 유클리드 호제법
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 최대공약수로 약분하면 기약분수
        int result = gcd(a, b);
        b = num2 / result;
        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                // 유한소수 조건 분모의 소인수가 2,5만 존재
                if (i % 2 != 0 && i % 5 != 0) {
                    return 2;
                }
            }
        }
        return answer;

    }

    // 유클리드 호제법 재귀호출
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
