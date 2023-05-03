import java.util.*;

public class LevelOne {
    public static void main(String[] args) {
        LevelOne lv1 = new LevelOne();
        System.out.println("폰켓몬 : " + lv1.pokemon());
    }

    private int pokemon() {
        int[] nums = { 3, 3, 3, 2, 2, 4 };
        int answer = 0;
        /*
         * 중복된 요소 저장하지 않는다
         * ArrayList 구현체와 달리 HashSet은 저장순서를 유지하지 않는다
         * arraylist: 사용자가 정의한 <제너릭>객체에 맞는 값을 넣어 저장하고 중복 삽입이 가능 단,
         * 수정 변경시 배열을 새로 생성해서 배열채로 집어넣기에 수정이 상대적으로 느림. 또한 키로 값을 찾을 수 없기에 검색 알고리즘에 매우 느린
         * 속도
         */
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (nums.length / 2 <= set.size())
            answer = nums.length / 2;
        else
            answer = set.size();
        return answer;
    }
}
