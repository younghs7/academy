package day60_수3_JAVA_Arrays클래스;

import java.util.Arrays;

public class Main3 {
	
	// Arrays의 메소드를 일일이 외우는 게 아니라
	// Arrays클래스가 깊은 복사, 얕은 복사, 정렬, 비교를 지원하는구나! 를 아는 것이 목적이다.
	// 상세내용은 나중에 필요할 때 검색하면 된다.
			
	public static void main(String[] args) {

		// 배열의 깊은 복사 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int[] iArr = {11, 22, 33, 44, 55};
		
		int[] iCopyArr = Arrays.copyOf(iArr, iArr.length);
			System.out.println(iCopyArr); 		 // 11, 22, 33, 44, 55
		
		int[] iCopyRangeArr = Arrays.copyOfRange(iArr, 1, 4);
			System.out.println(iCopyRangeArr);			// 22, 33, 44
		
			
		// 배열의 얕은 복사 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		double[] dArr = {1.1, 1.2, 1.3, 1.4, 1.5};
		
		double[] dCopyArr = new double[dArr.length];
		System.arraycopy(dArr, 1, dCopyArr, 0, 3);
			System.out.println(dCopyArr);			// 1.2, 1.3, 1.4, 0.0, 0.0
			
			
			
		// 배열의 비교 - Arrays.equals ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		if(true == Arrays.equals(iArr, iCopyArr) )
		{ 
			System.out.println("두 배열은 같습니다."); 
		}
		else
		{ 
			System.out.println("다릅니다."); 
		}
			
		
		// 배열의 정렬 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int[] ar1 = {5, 6, 0, 4, 1};
		Arrays.sort(ar1);
		
		for(int n: ar1)
		{
			System.out.println(n);			// 0, 1, 4, 5, 6
		}
		
		
		
		
		
	}

}
