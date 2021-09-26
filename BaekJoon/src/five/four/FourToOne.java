package five.four;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
 
public class FourToOne {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(bf.readLine()) % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
		
        
		System.out.print(h.size());
	}
}