import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Six sol = new Six();
        String str = "hi12392";

        System.out.println("문자열 정렬 = " + sol.st(str));
        System.out.println("컨트롤제트 = " + sol.control("10 Z 20 Z 1"));
        System.out.println("369 = " + sol.game(2312723));
    }

    // 문자열 출력
    public int[] st(String str) {
        ArrayList<Integer> answer = new ArrayList<>();
        int result = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ((int) charArr[i] <= 57) {
                answer.add(Character.getNumericValue(charArr[i]));
            }
        }
        String strRepalce = str.replaceAll("[^0-9]", "");
        for (char ch : strRepalce.toCharArray()) {
            result += Character.getNumericValue(ch);
        }

        // Collections.sort(answer, Collections.reverseOrder());
        return Arrays.stream(str.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();

    }

    // 컨트롤제트
    public int control(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }

    // 369
    public int game(int order) {
        int answer = 0;
        int count = 0;
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                count++;
            }
            order = order / 10;
        }
        answer = count;
        // return (int)
        // Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i
        // -> i == 3 || i == 6 || i == 9).count();
        return answer;
    }
}
