package sort;

import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("가장 큰 수 : " + lv2.bigNum());
    }

    // 가장 큰 수
    private String bigNum() {
        int[] numbers = { 3, 30, 34, 5, 9 };
        String answer = "";
        String[] res = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            res[i] = String.valueOf(numbers[i]);
        }

        /*
         * 문자열을 합쳤을 때 비교
         * Comparable과 Comparator는 모두 interface
         * Comparable 혹은 Comparator을 사용하고자 한다면 인터페이스 내에 선언된 메소드를 반드시 구현해야한다.
         * Comparable -> compareTo(T o) 재정의
         * Comparator -> compare(T o1, T o2) 재정의
         */
        Arrays.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (res[0].equals("0"))
            return "0";
        for (int i = 0; i < res.length; i++) {
            answer += res[i];
        }
        return answer;
    }
}
