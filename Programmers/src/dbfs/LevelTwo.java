package dbfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* 깊이/너비 우선 탐색(DFS/BFS) */
public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("타겟 넘버 : " + lv2.target());
    }

    //타켓 넘버
    private int target() {
        int idx = 0;
        int [] numbers = {4,1,2,1};
        int tg = 4;
        int answer = 0;

        answer = inpsect(idx, numbers, 0, tg, answer, numbers.length);

        return answer;
    }
    private int inpsect(int idx, int[] numbers, int point, int tg, int answer, int size) {

        int num1 = point + numbers[idx];
        int num2 = point + (-1 * numbers[idx]);
        idx++;

        int result = answer;
        if (idx == size) {
            if (num1 == tg || num2 == tg) {
                result++;
            }
        } else {
            result = inpsect(idx, numbers, num1, tg, result, size);
            result = inpsect(idx, numbers, num2, tg, result, size);
        }

        return result;
    }
}
