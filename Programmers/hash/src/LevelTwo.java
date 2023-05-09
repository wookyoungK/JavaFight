import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("전화번호 목록 : " + lv2.phoneBook());
        System.out.println("의상 : " + lv2.clothes());
    }

    // 전화번호 목록
    private boolean phoneBook() {
        String[] phone_book = { "119", "97674223", "1195524421", "112" };
        boolean answer = true;
        /*
         * indexOf() 대상 문자열에서 찾고자 하는 문자의 index값을 찾고싶을때
         * contains() 대상 문자열에서 찾고자 하는 문자열이 포함되어있는지 여부를 알고 싶을때
         * matches() 대상 문자열에서 정규표현식(숫자, 영문자, 한글)등이 포함되어있는지 여부를 알고 싶을때
         * 
         * 문제해결
         * str으로 구성된 리스트를 sort() 정렬하면 각 문자열 요소의 첫 번째 index의 문자 기준으로 정렬된다. 길이, 크기가 아님
         * 3, 11, 213 ,1234567 이라면 -> 11,1234567, 213,3 으로 정렬된다.
         * 여기서 문제를 보면 바로옆에는 가장 가까운 숫자 문자열이 오기 때문에 바로 옆 문자열만 비교하면 된다.
         */
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }
        /*
         * 첫 풀이
         * 효율성 오류
         * for (int i = 0; i < phone_book.length; i++) {
         * for (int j = 0; j < phone_book.length; j++) {
         * if (i != j) {
         * if (phone_book[i].contains(phone_book[j]))
         * answer = false;
         * }
         * }
         * 
         * }
         */
        return answer;
    }

    private int clothes() {
        String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } };
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            System.out.println(clothe[1]);
            String type = clothe[1];
            // 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        System.out.println(map);
        /*
         * iterator : 반복자
         * 반복자는 객체 지향적 프로그래밍에서 배열이나 그와 유사한 자료구조의 내부요소를 순회하는 객체
         * iterator는 ArrayList, HashSet과 같은 컬렉션을 반복하는 데 사용할 수 있는 객체
         * -> 리스트, 컨테이너를 순회할 수 있게 해주는 객체
         */
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        return answer - 1;
    }

}
