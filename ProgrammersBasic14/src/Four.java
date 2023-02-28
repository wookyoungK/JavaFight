import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Four sol = new Four();
        // int value = sc.nextInt();
        String st = sc.nextLine();
        int [] arr = {1,2,4,3,5,6};


        // System.out.println("아메리카노 = "+sol.americano(value));
        System.out.println("뒤집기 = "+sol.reverse(arr));
        System.out.println("문자열 뒤집기 = "+sol.stReverse(st));
    }

    // 아메리카노
    public int[] americano(int value){
        // List<Integer> answer = new ArrayList<Integer>();
        // answer.add(value/5500);
        // answer.add(value%5500);
        return new int[] { value / 5500, value % 5500 };
        // return answer;
    }

    //뒤집기
    public int[] reverse(int[] arr){
        int [] answer = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            answer[(arr.length-1)-i] = arr[i];
        }
        return answer;
    }

    //문자열 뒤집기
    public String stReverse(String st){
        char[] charArrr = st.toCharArray();
        char[] answer = new char[charArrr.length];
        for(int i=charArrr.length-1; i>=0; i--){
            answer[(charArrr.length-1)-i] = charArrr[i];
        }
        String charStr = new String(answer);

        //StringBuilder 쓰기!
        // StringBuilder sb = new StringBuilder();
        // sb.append(st);
        // sb.reverse();

        // return sb.toString();
        
        return charStr;
    }
}
