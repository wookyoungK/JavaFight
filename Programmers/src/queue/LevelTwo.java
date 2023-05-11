package queue;

import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("기능개발 : " + lv2.fd());
    }
    
    //기능개발
    private int [] fd(){
        // int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] progresses = {93, 30, 55};
        // int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] speeds = {1, 30, 5};

        Queue<Integer> queue = new LinkedList<>(); 
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < progresses.length; i++) {
            int cnt = (100 - progresses[i])%speeds[i] != 0 ? ((100 - progresses[i])/speeds[i])+1 : (100 - progresses[i])/speeds[i];
            if (!queue.isEmpty() && queue.peek() < cnt) {
                arr.add(queue.size());
                queue.clear();
            }   
            queue.add(cnt);
        }
        arr.add(queue.size());
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
