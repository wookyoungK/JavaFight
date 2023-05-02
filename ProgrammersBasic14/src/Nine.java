public class Nine {
    public static void main(String[] args) {
        Nine sol = new Nine();
        System.out.println("k의 개수 = " + sol.numCount());
        System.out.println("다음에 올 숫자 = " + sol.sequence());
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

    //다음에 올 숫자
    public int sequence() {
        //등비수열 or 등차수열
        int[] common = {1, 2, 3, 4};
//        int[] common = {2,4,8};
        int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }

        return answer;
    }
}
