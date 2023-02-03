#include <stdio.h>

void func(int* p)
{
	*p = *p - 5;	// 값에 값을 넣을 거라는 의미
					// p = p + 5; 는 p 주소값에 p[5] 주소값을 넣을 거라는 의미

}


int main() {
	int a = 13;
	func(&a);
	printf("%d \n", a);		// 8
	


	// 문제 별개 테스트 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ \n");

	printf("%d \n", a);		// 8
	printf("%x \n", &a);	// a 주소값

	int* p = &a;
	*p = 1;
	printf("%d \n", *p);	// 1
	printf("%x \n", p);		// a = p 주소값
		 
	// int* v = 1;			// 안 됨. 오류 생김. int* v 가 아닌 int *v라는 명확한 증거
	// ▲
	// int *v = 1; 이 아닌 int* v 인 이유

	// 선언에서의 int *p 와 읽기에서의 *p 는 전혀 다르다.
	// 선언에서의 int* p 는 int 참조형 변수 p 를 의미하고
	// 변수 읽기에서의 *p는 포인터 변수(참조변수) p의 내용물을 의미한다. 

}