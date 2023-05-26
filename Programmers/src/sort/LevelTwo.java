package sort;

import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("가장 큰 수 : " + lv2.bigNum());
        System.out.println("소수 찾기 : "+lv2.decimal("011"));
        System.out.println("카펫 : "+lv2.capet(24,24));
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


    /* 소수 찾기 */
    HashSet<Integer> numbersSet = new HashSet<>();

    //소수판별
    private boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        int lim = (int)Math.sqrt(num);
        for (int i = 2; i <= lim; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    //재귀함수
    private void recursive(String comb, String others) {
//        System.out.println("comb : "+comb + " others : "+ others);
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals(""))
            numbersSet.add(Integer.valueOf(comb));

        // 2. 남은 숫자 중 한 개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));

    }

    private int decimal(String numbers) {
        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);

        // 2. 소수의 개수만 센다.
        int count = 0;
        Iterator<Integer> it = numbersSet.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (isPrime(number))
                count++;
        }

        // 3. 소수의 개수를 반환한다.
        return count;
    }

    //카펫
    private int [] capet(int yellow , int brown){
        int[] answer = new int[2];
        for (int i = 1; i * i <= yellow; i++) {
            if (yellow % i == 0) {
                answer[0] = yellow / i + 2; 
                answer[1] = i + 2;
                if (answer[0] * answer[1] - i * yellow / i == brown)
                    return answer;
            }
        }
        return answer;
    }
}
