public class test {
    public static void main(String[] args) {
        int num = 3;
        int total = 0;
        int [] answer =new int[num];
        int start = total/num;
        int compare = 0;

        if(total != 0){
            while(compare != total) {
                compare = 0;
                start = start -1;
                for (int i = 0; i < num; i++) {
                    answer[i] = start + i;
                    compare += answer[i];
                }
            }
        }else{
            start = -((num - 1) / 2);
            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
