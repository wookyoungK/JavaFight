import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Five sol = new Five();
        String st = "hello";
        System.out.println("문자 반복 출력 = "+sol.st(st,3));
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

}
