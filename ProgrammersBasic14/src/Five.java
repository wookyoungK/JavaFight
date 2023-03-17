import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Five sol = new Five();

        String st = "hello";
        String s = ".... . .-.. .-.. ---";

        int [] arr = {1,3,2,4,6};

        System.out.println("문자 반복 출력 = "+sol.st(st,3));
        System.out.println("숫자 -> 문자 출력 = "+sol.alien(51));
        System.out.println("진료 순서 = "+sol.emergency(arr));
        System.out.println("모스 부호 = "+sol.mos(s));
        System.out.println("서로다른구슬 = "+sol.combination(5).divide(sol.combination(2).multiply(sol.combination(3))));
    }

    //문자 반복 출력
    public String st (String st, int n){
        char[] ch = st.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<n; j++){
                sb.append(ch[i]);
            }
        }
        //other
        // for(char c : my_string.toCharArray()){
        //     sb.append((c + "").repeat(n));
        // }
        return sb.toString();

    }
    public String alien (int age) {
        String answer = "";
        String temp = Integer.toString(age);

        for(int i = 0; i<temp.length(); i++){
            System.out.println(temp.charAt(i));
            answer += (char)(temp.charAt(i)+49);
        }


        return answer;
    }

    public int[] emergency (int[] emergency){
        int[] answer = new int[emergency.length];
        int[] reverseArr = new int[emergency.length];
        int[] arr = new int[emergency.length];
        arr = Arrays.stream(emergency).sorted().toArray();
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }
        for (int i = 0; i < emergency.length; i++) {
            int target = i;
            answer[i] =
                    IntStream.range(0, emergency.length)
                            .filter(num -> emergency[target] == reverseArr[num])
                            .findFirst().getAsInt()+1;
        }
        return answer;
    }

    public String mos (String s){
        String answer ="";
        String [] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] stArr = s.split(" ");
        for (int i = 0; i < stArr.length; i++) {
            answer += (char) (Arrays.asList(str).indexOf(stArr[i])+97);
        }
        return answer;
    }

    public BigInteger combination(int num){
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
