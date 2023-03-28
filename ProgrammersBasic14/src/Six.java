import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Six sol = new Six();
        String str = "hi12392";

        System.out.println("문자열 정렬 = "+sol.st(str));
    }

    //문자열 출력
    public int [] st (String str){
        ArrayList<Integer> answer = new ArrayList<>();
        int result = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if((int)charArr[i] <= 57){
                answer.add(Character.getNumericValue(charArr[i]));
            }
        }
        String strRepalce = str.replaceAll("[^0-9]","");
        for(char ch : strRepalce.toCharArray()) {
            result += Character.getNumericValue(ch);
        }

//        Collections.sort(answer, Collections.reverseOrder());
        return Arrays.stream(str.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();

    }
}
