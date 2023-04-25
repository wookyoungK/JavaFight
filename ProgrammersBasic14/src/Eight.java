import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Eight sol = new Eight();
        System.out.println("안전 지대 = " + sol.safety());
        System.out.println("유한소수 판별하기 = " + sol.decimal());
        System.out.println("정규표현식 문자열 찾기 = " + sol.reg());
        System.out.println("특이한 정렬 = " + sol.sort());
        System.out.println("겹치는 선분의 길이 = " + sol.lines());
        System.out.println("치킨 쿠폰 = " + sol.coupon());
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

    // 정규표현식 문자열 찾기
    private static int reg() {
        String[] babbling = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
        // "aya", "ye", "woo", "ma" 오직 해당 문자열만 들어있는 것 찾기
        /*
         * 해당 문제 못품
         * 정규표현식의 기본은 숙지
         * 캐럿(caret) 기호 ^와 달러 기호 $는 정규식에서 특별한 뜻을 지닙니다. 두 기호를 '앵커(anchor)'라고 한다.
         * 캐럿 기호 ^는 텍스트의 시작, 달러 기호 $는 텍스트의 끝을 나타냄
         * ex) ^Mary 패턴은 "문자열이 시작하고 바로 Mary가 나타난다"
         * 위와 유사하게 snow$를 사용해서 문자열이 snow로 끝남
         * ^...$는 문자열이 패턴과 완전히 일치하는지 확인할 때 자주 사용
         * / + / → 하나 이상의 문자
         */
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                answer++;
            }
        }
        // result 3
        return answer;
    }

    // 특이한 정렬
    private static int[] sort() {
        // 문제 조건
        int[] numlist = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
        int n = 30;
        // 결과 : [36, 40, 20, 47, 10, 6, 7000, 10000]

        List<Integer> nums = new ArrayList<>();
        Arrays.sort(numlist);
        for (int num : numlist)
            nums.add(num);
        nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        // sort​(int[] a, int fromIndex, int toIndex)

        /*
         * OR
         * Collections 메소드 사용
         * Arrays.sort(arr2, Collections.reverseOrder());
         *
         * Override 직접 구현도 가능
         * Arrays.sort(arr2, new Comparator<Integer>() {
         *
         * @Override
         * public int compare(Integer i1, Integer i2) {
         * return i2 - i1;
         * }
         * });
         *
         * Collections.reverse(nums);
         */
        return nums.stream().mapToInt(i -> i).toArray();
    }

    private static int lines() {
        //선분이 점으로 주어질 때
        int[][] lines = { { 0, 1 }, { 2, 5 }, { 3, 9 } };
        int answer = 0;
        int[] arr = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                arr[j]++;
            }
        }
        answer = (int) Arrays.stream(arr).filter(i -> i >= 2).count();
        return answer;
    }
    private static int coupon(){
            int coupon = 1999;
            int count = 0;

            while (coupon >= 10) {
                int leftCoupon = coupon % 10;
                count += coupon / 10;
                coupon = leftCoupon + coupon / 10;
            }
            return count;
    }
}
