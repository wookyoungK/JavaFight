import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Two fp = new Two();
        Scanner sc = new Scanner(System.in);
         int nm1 = sc.nextInt();
         int dm1 = sc.nextInt();
         int nm2 = sc.nextInt();
         int dm2 = sc.nextInt();
         System.out.println("분수의 덧셈 = "+ fp.fountainPlus(nm1,dm1,nm2,dm2));
/*
        //배열 두배 만들기
        int [] num = new int[4];
        for (int i = 0 ; i < num.length; i++) {
        num[i] = sc.nextInt();
        }
*/
        sc.close();
    }

    // 분수의 덧셈
    public int[] fountainPlus(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {1,2};
        int lcm = 0;
        int gcd = 0;
        if (0 < denom1 && 0 < denom2 && 0 < numer1 && 0 < numer2) {
            int temp = 0;
            int a = denom1;
            int b = denom2;

            while (a % b != 0) {
                temp = a % b;
                System.out.println("tmp = "+ temp);
                a = b;
                b = temp;
            }
            if(denom1 % denom2 == 0){
                gcd = denom2;
                lcm = denom1;
            }else{
                gcd = temp;
                lcm = (denom1*denom2) / gcd;
            }

            System.out.println("gdc = " + gcd);
            System.out.println("lcm  = " + lcm);
        }

        return answer;
    }

    //배열 두배 만들기
    public int[] arrayMultiple(int[] numbers) {
        int[] answer = new int[numbers.length];
         if(numbers.length != 0){
           for(int i = 0; i<numbers.length; i++){
               answer[i] = numbers[i] * 2;
           }
         }
        return answer;
    }
}