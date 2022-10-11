package day14문제1풀이;

public class Patient {
	
	String name;
	int age;
	
	
	String jumin_num1;
	String jumin_num2; //주민번호를 앞뒤자리 또는 통짜로 나눌지를 생각하는 게 추상화이다. (어떻게 데이터를 어트리뷰트화를 시킬지 고려하는 게 추상화)
	
//	String diseaseName;
//	String diseaseCode
	Disease[] disease; //질병 정보
	
//	String docName;
//	String docID;
	Doctor[] myDoctor; //담당 의사
	
	/*
	 1. 추상화를 제대로 안 거치면 기능이 제한된다.
	 2. 데이터를 바꿔야하면 유지보수할 때 재활용이 안되서 다 뜯어고쳐야한다.
	 
	 3. 
	 */
	
	void printInfo() 
	{
		
	}
	
}
