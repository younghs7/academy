package day69_test_문자열_오름차순내림차순;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// 문자열 배열 정렬(가나다 순으로 소탕)
		String s[] = {"오렌지", "키위", "바나나", "메론", "가나"};
		Arrays.sort(s);	// 오름차순
				
		System.out.println("**** 오름차순 ****");
		for(int i = 0; i < s.length; ++i) {
			System.out.println(s[i]);
		}
		
		// 배열을 List로 변환
		List<String> list = Arrays.asList(s);
			
		// 리스트 뒤집어 주기
		Collections.reverse(list);

		System.out.println("**** 내림차순 ****");
		for(int i = 0; i < s.length; ++i) {
			System.out.println(s[i]);
		}
		
	}
}