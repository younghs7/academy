for i in [0, 3, 2]:
    print(i)
    print("hi")

    # 결과
    # 0
    # hi
    # 3
    # hi
    # 2
    # hi


print("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")

for i in range(5, 11, 2):   # 결국 range는 리스트를 리턴하는 것이다.
    print(i)                # 5이상, 11미만, +2 간격으로
                            # ★ '미만'이라는 점 주의하기

    # 결과
    # 5
    # 7
    # 9


print("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
a = [1, 2, 3]

for i in a:
    print(i)

    # 결과
    # 1
    # 2
    # 3