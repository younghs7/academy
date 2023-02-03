//#define _CRT_SECURE_NO_WARNINGS
//
//#include <stdio.h>
//#include <string.h>
//
//
//
//// 선언
//struct member {		// 스트럭처는 메소드없는 클래스라고 생각하면 된다.
//	char name[10];	// c언어에서는 String이라는 데이터형이 없다. 내부적으로 문자열의 경우는 끝에 null 이 들어가서 구분한다.
//	int num;
//
//};
//
//// 스트럭처라는 건 데이터를 모아서 구조화하겠다는 의미이다.
//
//
//
//int main()
//{
//	member m1;	// member m1 = new member() 가 아닌 이유:  힙에 올릴 필요없어서 new 없앰. 
//				//											클래스가 아니기 때문에 member() 사용 못함.
//
//	strcpy(m1.name, "jsh");		// 스트링 카피
//	
//	// strcpy를 안 쓰면 이렇게 일일이 작성해줘야 한다. 
//	m1.name[0] = 'j';
//	m1.name[1] = 's';
//	m1.name[2] = 'h';
//	m1.name[3] = 0x00 ;
//	
//	// 컴퓨터 입장에서 보면 m1.name은 참조형이다. 따라서 m1.name = "jsh"; 로 넣어줄 수가 없다.
//	// 자바같은 경우는 이것을 자동화 처리해준 것이다.
//	
//	printf("%s \n", m1.name);
//
//	m1.num = 100;	
//	printf("%d \n", m1.num);
//	
//
//	return 0;
//}
