package stack;

import java.util.*;


public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("괄호 : " + lv2.parenthesis());

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
}
