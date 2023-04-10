import java.util.*;
import java.util.stream.Collectors;

public class Seven {
    public static void main(String[] args) {
        Seven sol = new Seven();
        int[] arr = { 9, 10, 11, 8 };
        System.out.println("암호 해독 = " + sol.cipher("dfjardstddetckdaccccdegk", 4));
        System.out.println("한 번만 등장한 문자 = " + sol.one("dfjardstddetckdaccccdegk"));
        System.out.println("가장 큰 수 = " + sol.big(arr));
        System.out.println("배열 비교 = " + sol.compare());
        System.out.println("자릿수 합 = " + sol.sum());
        System.out.println("캐릭터의 좌표 = " + sol.coordinate());
    }

    // 암호해독
    public String cipher(String cipher, int code) {
        String answer = "";
        int i = 1;
        int num = code;
        while (num <= cipher.length()) {
            answer += cipher.charAt(num - 1);
            i++;
            num = code * i;
        }
        return answer;
    }

    // 한 번만 등장한 문자
    public String one(String s) {
        int[] alp = new int[26];

        for (int i = 0; i < s.length(); i++)
            alp[s.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < alp.length; j++)
            if (alp[j] == 1)
                sb.append((char) ('a' + j));
        return sb.toString();
    }

    // 가장 큰 수
    public int[] big(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array).max().getAsInt();
        answer[1] = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(answer[0]);
        return answer;
    }
    // 배열 비교
    public int compare() {
        int answer = 0;
        String[] s1 = { "a", "b", "c" };
        String[] s2 = { "com", "b", "d", "p", "c" };

        List<String> str = Arrays.stream(s1).collect(Collectors.toList());
        System.out.println(str);
        for (String string : s2) {
            if (str.contains(string)) answer++;
        }
        return answer;
    }

    // 자릿수 합
    public int sum() {
        int n  =213213;
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    // 캐릭터의 좌표
    public int [] coordinate() {
        //좌표 끝에 도착했을 때 -> 반대쪽으로 4번 갈 수 있음 최대 2번이 아니다 이 경우를 생각해야 함
        String [] keyinput = {"right", "right", "right", "right", "left", "left", "left", "left"};
        int [] board = {5, 5};
        int xCnt = 0;
        int yCnt = 0;
        final int leftCoord = -board[0] / 2;
        final int rightCoord = board[0] / 2;
        final int downCoord = -board[1] / 2;
        final int upCoord = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "down":
                    if (yCnt > downCoord) yCnt -= 1;
                    break;
                case "up":
                    if (yCnt < upCoord) yCnt += 1;
                    break;
                case "left":
                    if (xCnt > leftCoord) xCnt -= 1;
                    break;
                case "right":
                    if (xCnt < rightCoord) xCnt += 1;
                    break;
            }
        }

        int[] answer = { xCnt, yCnt };
        return answer;
    }
}
