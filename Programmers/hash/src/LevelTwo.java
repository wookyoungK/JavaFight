import java.util.*;

public class LevelTwo {
    public static void main(String[] args) {
        LevelTwo lv2 = new LevelTwo();
        System.out.println("전화번호 목록 : " + lv2.phoneBook());
    }

    //전화번호 목록
    private boolean phoneBook() {
        String[] phone_book = { "119", "97674223", "1195524421","112" };
        boolean answer = true;
        // indexOf() 대상 문자열에서 찾고자 하는 문자의 index값을 찾고싶을때
        // contains() 대상 문자열에서 찾고자 하는 문자열이 포함되어있는지 여부를 알고 싶을때
        // matches() 대상 문자열에서 정규표현식(숫자, 영문자, 한글)등이 포함되어있는지 여부를 알고 싶을때

        //문제해결
        // str으로 구성된 리스트를 sort() 정렬하면 각 문자열 요소의 첫 번째 index의 문자 기준으로 정렬된다. 길이, 크기가 아님
        // 3, 11, 213 ,1234567 이라면 -> 11,1234567, 213,3 으로 정렬된다.
        // 여기서 문제를 보면 바로옆에는 가장 가까운 숫자 문자열이 오기 때문에 바로 옆 문자열만 비교하면 된다.

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }
/*
        첫 풀이
        효율성 오류
         for (int i = 0; i < phone_book.length; i++) {
             for (int j = 0; j < phone_book.length; j++) {
                 if (i != j) {
                     if (phone_book[i].contains(phone_book[j]))
                         answer = false;
                 }
             }

}*/
    return answer;
    }
}
