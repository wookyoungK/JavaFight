import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int [] arr = {3,2,4,5,6};
        Three sol = new Three();
        System.out.println("중앙값 구하기 = "+sol.middle(arr));
    }

    //중앙값 구하기
    public int middle(int array[]){
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
/*
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
}*/

        return answer;
    }
}
