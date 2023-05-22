package exhaustive;

import java.util.*;

public class LevelOne {
    public static void main(String[] args) {
        LevelOne lv1 = new LevelOne();
        System.out.println("최소직사각형 : " + lv1.rectangle());
    }

    //최소직사각형
    //완전탐색의 가장 단순한 방법으로 가장 단순한 문제푸는 방법 -> 단순 Brute-Force
    private int rectangle(){
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int w = 0;
        int h = 0;
        for (int[] card : sizes) {
            w = Math.max(w, Math.max(card[0], card[1]));
            h = Math.max(h, Math.min(card[0], card[1]));
        }
        int answer = w * h;
        return answer;
    }
}
