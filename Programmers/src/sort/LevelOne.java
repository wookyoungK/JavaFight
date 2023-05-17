package sort;

import java.util.*;
public class LevelOne {
    public static void main(String[] args) {
        LevelOne lv1 = new LevelOne();
        System.out.println("K번째수 : "+lv1.knum());
    }

    //K번째수
    private int [] knum (){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer =  new int [commands.length];

        for (int i = 0; i < commands[0].length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}
