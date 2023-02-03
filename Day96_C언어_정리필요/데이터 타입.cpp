//#include <stdio.h>
//
//#define unsinged int UINT	// 실무에서는 헷갈리기 때문에 이런 식으로 redefine 으로 바꿔서 쓴다. 
//
//
//
//struct member {		// 스트럭처는 메소드없는 클래스라고 생각하면 된다.
//	char name[10];
//	int num;
//
//};
//
//
//
//int main()
//{
//	char a;
//	printf("%d \n", sizeof(a));	// 1 --> 이 때는 아스키 코드가 없던 때라 자바와 다르게 1byte 크기를 가진다.
//
//	unsigned int b;
//	signed int c;
//	printf("int %d \n", sizeof(c));
//	
//	long d;
//	printf("long %d \n", sizeof(d));
//	
//	long long e;
//	printf("long long %d \n", sizeof(e));
//
//
//	// int는 싸인드 포맷,  long는 언싸인드 포맷
//	// double는 싸인드 포맷, long double은 언싸인드 포맷 
//
//
//
//	return 0;
// }
