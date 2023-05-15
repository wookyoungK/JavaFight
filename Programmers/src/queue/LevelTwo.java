package queue;

import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("기능개발 : " + lv2.fd());
        System.out.println("다리를 지나는 트럭 : " + lv2.bridge());
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

    //다리를 지나는 트럭
    private int bridge(){
        int[] truck_weights = {7, 4, 5, 6};
        int bridge_length = 2;
        int weight = 10;

        int answer = 0;
        int index = 0;
        int currentWeight = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        while(index < truck_weights.length){
            answer++;
            currentWeight -= queue.poll();
            if(currentWeight + truck_weights[index] <= weight){
                queue.offer(truck_weights[index]);
                currentWeight += truck_weights[index++];
            } else{
                queue.offer(0);
            }

        }
        return answer + bridge_length;
    }
}
