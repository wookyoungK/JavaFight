import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] middleArr = { 3, 2, 4, 5, 6 };
        int[] modeArr = { 1, 1, 1, 2, 2, 3, 3 };
        Three sol = new Three();
        System.out.println("중앙값 구하기 = " + sol.middle(middleArr));
        System.out.println("최빈값 구하기= " + sol.mode(modeArr));
        System.out.println("홀수 정렬 = " + sol.oddnum(n));
        System.out.println("평균값 구하기 = " + sol.avg(middleArr));
    }

    // 중앙값 구하기
    public int middle(int array[]) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        /*
         * for (int i = 0; i < array.length; i++) {
         * for (int j = i; j < array.length; j++) {
         * if (array[j] < array[i]) {
         * int temp = array[i];
         * array[i] = array[j];
         * array[j] = temp;
         * }
         * }
         * }
         */

        return answer;
    }

    // 최빈값 구하기
    public int mode(int array[]) {
        int answer = 0;
        int max = 0;
        int frequent[] = new int[1000];

        for (int i = 0; i < array.length; i++) {
            frequent[array[i]]++;
            if (max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        int temp = 0;
        for (int i = 0; i < frequent.length; i++) {
            if (max == frequent[i])
                temp++;
            if (temp > 1)
                answer = -1;
        }

        return answer;
    }

    // 홀수 정렬
    public int[] oddnum(int n) {

        // IntStream으로도 사용가능
        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();

        // 제네릭
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int size = n;
        if (size % 2 != 0) {
            size = size / 2 + 1;
        } else {
            size = size / 2;
        }
        int[] answer = new int[size];
        int eventNumber = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[eventNumber] = i;
                eventNumber++;
            }
        }
        return answer;
    }

    // 평균값 구하기
    public double avg(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = answer / numbers.length;

        // arrays.stream을 많이 쓴다
        // return Arrays.stream(numbers).average().orElse(0);
        return answer;
    }

}
