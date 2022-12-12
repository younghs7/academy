package day58_자바정리_수4;

import day58_자바정리_수1_저번주_문제_추가요구.URLParameter;

public class Main_4 {

	public static void main(String[] args) {

		
		
		
		int[] a = {1, 2, 3};
		
		URLParameter[] ua1 = {null, null, null};
		URLParameter[] ua2 = {new URLParameter(), new URLParameter(), new URLParameter()};
		
		
		
		
		String[] str1 = new String[3];  
		String[] str2 = {null, null, null};
		
		
		
		// String 배열 초기화 방법 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 첫번째 방법
		String[] strName1 = new String[3];
		strName1[0] = new String("정성훈");
		strName1[1] = new String("임형민");
		strName1[2] = new String("박수현");
		
		// 두번째 방법
		String[] strName2 = new String[] {new String("정성훈"), new String("임형민"), new String("박수현") };
	
		// 세번째 방법
		String[] strName3 = {new String("정성훈"), new String("임형민"), new String("박수현") };
		
		// 네번째 방법
		String[] strName4 = {"정성훈", "임형민", "박수현"};
		
		
		
		// 문제 1ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		 int[] a0 = new int[] {1, 2, 3};
		 int[] a1 = new int[] {4, 5, 6};
		 int[] a2 = new int[] {7, 8, 9};
		 int[] a3 = new int[] {10, 11, 12};
		 int[] a4 = new int[] {13, 14, 15};
		
		 // 을 이차원배열로 만드시오.
		 
		int[][] b = new int[][] {a0, a1, a2, a3, a4};      // <-- 2차원배열부터는 element는 참조값일 뿐이다. 가장 아랫 배열만 primitive 타입이고
		
		
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}

}
