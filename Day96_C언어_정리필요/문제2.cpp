//#include <stdio.h>
//
//int main(void) {
//
//	int n = 4;
//	int* pt = NULL;
//	pt = &n;
//
//	
//	printf("%d", &n + *pt - *&pt + n);	// 8
//	
//
//	printf("\n%d \n", pt);	// 주소값 1
//	printf("%d \n", pt);	// 주소값 1
//	printf("%d \n", &pt);	// 주소값 2
//	printf("%d \n", &pt);	// 주소값 2
//
//	// 주소값1 ≠ 주소값 2
//	// 아, address 메모리에 address 값을 가져오나보네.
//
//	// printf("%d \n", &(&pt));		// ◀ 이거는 오류 나네. 메모리의 주소의 주소의 주소는 될까 싶었다만
//
//	printf("%d \n", *&pt);		// 주소값 1
//	printf("%d \n", **&pt);		// 4  ◀ 맞네. 메모리의 주소값의 주소값을 가져오는 게
//
//	printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ \n");
//
//	printf("%d \n", pt - pt);		// 0
//	printf("%d \n", pt + 1);		// 주소값1 int 간격 다음
//	printf("%d \n", pt + 2);		// 주소값1 int 2개 간격 다음
//	printf("%d \n", *(pt + 2));		// 주소값2 pt[2]의 값을 가져옴. (설정 안했기 때문에 쓰레기값)
//
//}