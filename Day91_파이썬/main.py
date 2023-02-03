
def main():

    list = [4, 66, 33, 5, 7 ,1]

    part = list[2:5]
    print(part)     # [33, 5, 7]

    list[4] = 0
    print(list[4])  # 0

    list[2:5] = [222, 222, 222]
    print(list)     # [4, 66, 222, 222, 222, 1]

    list[:3] = [1, 2, 3]
    print(list)     # [1, 2, 3, 222, 222, 1]

    list[3:] = [0, 0, 0, 0]
    print(list)     # [1, 2, 3, 0, 0, 0, 0]

    list[:] = [0, 0, 0, 0]
    print(list)     # [0, 0, 0, 0]

    list = [1, 2, 3, 4, 5]
    print(list)     # [1, 2, 3, 4, 5]

    # print(type([1, 2, 3]))  # <class 'list'>
    #
    # a = [1, 2, 3]
    # for i in a:
    #     print(i)
    #
    # for i in [1, "hello", 3.14]:
    #     print(i)
    #
    # ll = [1, 2, 3] + [0, "string", 7.14]
    # print(ll)  # [1, 2, 3, 0, 'string', 7.14]
    #
    # ll = [1, 2, 3] * 3
    # print(ll)  # [1, 2, 3, 1, 2, 3, 1, 2, 3]
    #
    # ll = 3 * [1, 2, 3]
    # print(ll)  # [1, 2, 3, 1, 2, 3, 1, 2, 3]
    #
    # # ll = [1, 2, 3] - [1, 2]     # TypeError: unsupported operand type(s) for -: 'list' and 'list'
    # # ll = [1, 2, 3] ** 3         # TypeError: unsupported operand type(s) for ** or pow(): 'list' and 'int'

    list1 = [11, 22, 33, 44, 55]
    print(list1)
    print(list1[0])     # 11
    print(list1[1])     # 22
    print(list1[2])     # 33
    print(list1[3])     # 44
    print(list1[4])     # 55

    print(list1[-1])    # 55
    print(list1[-2])    # 44
    print(list1[-3])    # 33
    print(list1[-4])    # 22
    print(list1[-5])    # 11

    # age = input("나이를 입력하세요:")
    # age = eval(age)
    # print("당신의 나이는", age, "살 입니다.")
    #
    # # print("15" + 5)
    # # 파이썬은 자바나 자바스크립트처럼 묵시적 형변환하지 않는다.


#  =================================================

# age = eval(input("나이를 입력하세요: "))
# print("당신의 나이는", age + 10, "살 입니다.")
# ----------------------------------------------


main()
