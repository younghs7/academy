

def main():
    age = input("나이를 입력하세요:")      # string 리턴함
    print(type(age))                    # <class 'str'>
    age = eval(age)
    print(type(age))                    # <class 'str'>
    print("당신의 나이는", age, "살 입니다.")


    age = "10"
    print("당신의 나이는", age + 10, "살 입니다.")        # ▶ 오류
    print("15" + 5)                                   # ▶ 오류


# 오류난다. 묵시적 형변환 안 된다. 명시적 형변환 해야 된다.
# 파이썬은 자바나 자바스크립트처럼 묵시적 형변환하지 않는다.


main()