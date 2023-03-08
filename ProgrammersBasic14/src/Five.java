import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Five sol = new Five();
        String st = "hello";
        int num = 51;
        System.out.println("문자 반복 출력 = "+sol.st(st,3));
        System.out.println("숫자 -> 문자 출력 = "+sol.alien(51));
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

}
