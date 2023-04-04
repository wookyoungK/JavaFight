import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Seven sol = new Seven();
        System.out.println("암호 해독 = "+sol.cipher("dfjardstddetckdaccccdegk",4));
        System.out.println("한 번만 등장한 문자 = "+sol.one("dfjardstddetckdaccccdegk"));
    }
    //암호해독
    public String cipher (String cipher, int code){
        String answer = "";
        int i=1;
        int num=code;
        while (num <= cipher.length()){
            answer += cipher.charAt(num - 1);
            i++;
            num = code * i;
        }
        return answer;
    }
    //한 번만 등장한 문자
    public String one (String s){
        int[] alp = new int[26];

        for (int i = 0; i < s.length(); i++)
            alp[s.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < alp.length; j++)
            if (alp[j] == 1)
                sb.append((char) ('a' + j));
        return sb.toString();
    }
}
