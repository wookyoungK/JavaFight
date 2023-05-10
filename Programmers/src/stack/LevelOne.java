package stack;

import java.util.*;

public class LevelOne {
    public static void main(String[] args) {
        LevelOne lv1 = new LevelOne();
        System.out.println("같은 숫자는 싫어 : " + lv1.num());
    }

    //같은 숫자는 싫어
    private int[] num() {
        int [] arr = {1,1,3,3,0,1,1};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
