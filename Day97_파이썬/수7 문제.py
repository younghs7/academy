

def getBirthDay(num):

    str = num.split("-")

    return str[0]




def main():
# 문제 1
# 2이상 100미만의 정수 중에 2로 나누어 지지 않고 동시에 3으로도 나누어 지지 않는 수를 찾아 출력해보시오
# 단, while문과 continue문을 사용하여 구현

    num = 2;
    while(True):

        if(num == 100):
            break

        # 2배수이면
        if(num % 2 == 0):
            num = num + 1
            continue

        # 3배수이면
        if(num % 3 == 0):
            num = num + 1
            continue

        print(num)
        num = num + 1


# 문제 2
# 주민등록 번호를 입력하면 생년원일을 리턴하는 함수를 구현
# 760219-2992112 -> 760219

    num = "760219-2992112"
    birthDay = getBirthDay(num)

    print(birthDay) # 760219


main()


