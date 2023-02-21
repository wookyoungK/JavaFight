import java.math.BigDecimal;
import java.util.Scanner;

public class One {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        One sol = new One();
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        System.out.println("두 수의 합 = " + sol.plus(sc1, sc2));
        System.out.println("두 수의 차 = " + sol.minus(sc1, sc2));
        System.out.println("두 수의 곱 = " + sol.multiple(sc1, sc2));
        System.out.println("몫 구하기 = " + sol.quotient(sc1, sc2));
        System.out.println("두 수의 나눗셈 = " + sol.divide(sc1, sc2));
        System.out.println("숫자 비교하기 = "+ sol.compare(sc1,sc2));
        sc.close();
    }
    // 두 수의 합
    public int plus(int num1, int num2) {
        int answer = -1;
        boolean number = (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000);
        if (number) {
            answer = num1 + num2;
        }
        return answer;
    }

    // 두 수의 차
    public int minus(int num1, int num2) {
        int answer = -1;
        boolean number = (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000);
        if (number) {
            answer = num1 - num2;
        }
        return answer;
    }

    //두 수의 곱
    public int multiple(int num1, int num2) {
        int answer = 0;
        boolean number = (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100);
        if (number) {
            answer = num1 * num2;
        }
        return answer;
    }

    // 몫 구하기
    public int quotient(int num1, int num2) {
        int answer = 0;
        boolean number = (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100);
        if (number) {
            answer = num1/num2;
        }
        return answer;
    }

    //두 수의 나눗셈
    public int divide(int num1, int num2) {
        int answer = 0;
        boolean number = (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100);
        if (number) {
            double decimal = ((num1*1.0) / num2) * 1000 ;
            answer = (int) decimal;

        }
        return answer;
    }

    //숫자 비교하기
    public int compare(int num1, int num2) {
        int answer = 0;
        boolean number = (num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000);
        if (number) {
            if(num1 == num2){
                answer = 1;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}