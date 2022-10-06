package day13Sort_문제1;

import java.util.Scanner;

public class Day13Sort_문제1MainMy2 {

	public static void main(String[] args) {
		
	Sort s = new Sort();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("배열 크기 입력");
	int 배열크기 = sc.nextInt();
	
	System.out.println("정렬 타입 입력");
	System.out.println("1:오름차순 2:내림차순");
	int 입력타입 = sc.nextInt();
	
	//배열을 생성함. 파라미터는 배열 크기
	s.gen배열(배열크기);
	
	//배열을 랜덤값으로 채움
	s.fillArrayWithRandom();
	
	//오름차순 정렬 실행
	s.setAscendingOrder();
	
	//내림차순 정렬 실행
	s.setDescendingOrder();
	
	//1: 오름차순 정렬 실행 
	//2: 내림차순 정렬 실행
	s.SortArray(입력타입);
	
	s.printArrayInfo();
	
	
	
			
	}

}
