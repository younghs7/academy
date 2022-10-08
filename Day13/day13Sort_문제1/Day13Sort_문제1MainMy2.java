package day13Sort_문제1;

import java.util.Scanner;

public class Day13Sort_문제1MainMy2 {

	public static void main(String[] args) {
		
	int[] ar = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99};	
		
	Sort s = new Sort();
		
//-사용자가 가진 배열을 등록하는 경우 -----------------------------------
	//배열 등록함.
	s.registerArray(ar);

	
//--배열 생성하는 경우-----------------------------------------------
	//배열을 생성함. 파라미터는 배열 크기
	s.genArray(100);

	//배열을 랜덤값으로 채움
	s.fillArrayWithRandom();
//--생성 또는 등록한 배열을 정렬함--------------------------

	//1: 오름차순 정렬 실행 
	//2: 내림차순 정렬 실행
	s.SortArray(2);
	
	
//배열 상태 print------------------------------------------------------
	s.printArrayInfo();
	
	
	
			
	}

}
