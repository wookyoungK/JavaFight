package stack;

import java.util.*;


public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("괄호 : " + lv2.parenthesis());
        System.out.println("주식가격 : " + lv2.stock());

    }
    //괄호
    private boolean parenthesis(){
        Stack<Character> stack = new Stack<>();  
        String s = "())(()";
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '(') {  
                stack.push('(');  
            } else if (s.charAt(i) == ')') {  
                if (stack.isEmpty()) {  
                    return false;  
                }  
                stack.pop();  
            }  
        }  
        return stack.isEmpty();  
    }

    //주식가격
    private int [] stock(){
        int[] prices = { 1, 2, 3, 2, 3 };
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack();

        // 순서를 stack에 저장하여 비교하는 방법 이런식으로 생각해서 많이푼다
        // 주어진 데이터를 저장하는것이 아닌 stack을 이용하여 index 순서를 비교
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }
}
