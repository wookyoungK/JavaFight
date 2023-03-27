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
        System.out.println("배열회전시키기 = "+sol.rotation(arr,"left"));
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

    public ArrayList<Integer> rotation (int[] numbers, String direction) {
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        ArrayList<Integer> num_list = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            num_list.add(numbers[i]);
        }
/*
        if(direction == "left"){
        == 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데,
        String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교한다는 점이다.
        기본 타입의 int, char형등은 Call by Value* 형태로
        기본적으로 대상에 주소값을 가지지 않는 형태로 사용된다.
        하지만 String은 일반적인 타입이 아니라 클래스다.
        클래스는 기본적으로 Call by Reference 형태로 생성 시 주소값이 부여된다.
        그렇기에 String타입을 선언했을때는 같은 값을 부여하더라도 서로간의 주소값이 다른 것이다.
    */
        if(direction.equals("left")){
            num_list.add(num_list.get(0));
            num_list.remove(0);
        }else{
            num_list.add(0,num_list.get(num_list.size()-1));
            num_list.remove(num_list.size()-1);
        }
        return num_list;
    }
}
