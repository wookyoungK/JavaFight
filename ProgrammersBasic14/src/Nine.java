public class Nine {
    public static void main(String[] args) {
        Nine sol = new Nine();
        System.out.println("k의 개수 = " + sol.numCount());
    }

    //k의 개수
    public static int numCount() {
        int i = 10;
        int j = 50;
        int k = 5;
        int answer = 0;

/*        String을 추가하여 형변환으로 푸는 방법
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
*/

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
