

def main():
# bool = true  오류 생김
    bool = True

# if문 쓰는 법
    num = 10
    if num > 10:
        print("10 이상")
    elif num == 10:
        print("10 임")
    else:
        print("10미만")


# and, or ( &&, || 아님 )
    num = 11
    if (num > 10) or (num < 0):
        print("num > 10 or num < 0")
    elif (0 <= num) and (num <= 10):
        print("0 <= num <= 10")


#
    if True:
        print("AAA")    # AAA

    num = 10
    if num:
        print("10은 true로 실행")     # 10 실행

    num = 0
    if num:
        print("0 실행")
    else:
        print("0은 false로 해석")

    num = "asds"
    if num:
        print("문자열은 true로 실행")

    # 즉, 0 = false이고, 0(false)이 아니면 true로 판단한다.
    # 이건 파이썬만 그런 게 아니라 다른 ㅓㅇㄴ어 대부분이 그럼

main()