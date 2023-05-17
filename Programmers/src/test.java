import java.util.*;

public class test {
    public static void main(String[] args) {

        int[] prices = { 1, 2, 3, 2, 3 };
        int [] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                System.out.println(stack);
                for (int j = 0; j < answer.length; j++) {
                    System.out.println(answer[i]);
                }
                stack.pop();
                System.out.println(stack);
            }
            stack.push(i);
        }
        System.out.println(stack);
    }
}
// stack = 0, prices = 2 ,
// stack = 1, prices = 2,
// stack = 2, prices = 2