package day66_수4_컬렉션_Queue_문제풀이;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main4 {

	public static void main(String[] args) {


		Queue<List<String>> queue = new LinkedList<>();
		
		
		List<String> aArr = new ArrayList<>();
		List<String> bArr = new ArrayList<>();
		List<String> cArr = new ArrayList<>();
		
		for(int i = 0; i< 5; i++)
		{
			aArr.add("a" + (i+1));
			bArr.add("b" + (i+1));
			cArr.add("c" + (i+1));
		}
		
		queue.add(aArr);
		queue.add(bArr);
		queue.add(cArr);
		
		List<String> temp = null;
		int size = queue.size();
		for(int i = 0; i < size; i++)	// ◀ queue.size()를 안에 넣었더니 정상작동 안됨. for문이 반복될 때마다 size()가 호출되기 때문이다.   
		{								// remove()를 하니 size()값이 줄어들었기 때문.   
										// 이걸 보고 i < size 이 값이 if문 파라미터로 들어간다는 깨달음을 얻었다.
										
			temp = queue.remove();		
			
			for(String s : temp)
			{
				System.out.println(s);
			}
		}
		
		
		
	}

}
