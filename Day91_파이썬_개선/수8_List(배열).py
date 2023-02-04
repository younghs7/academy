def main():

# 파이썬에서는 배열은 list 명칭을 가진다.
    print(type([1, 2, 3]))      # <class 'list'>

    a = [1, 2, 3]
    for i in a:
        print(i)        # 1
                        # 2
                        # 3

    for i in [1, "hello", 3.14]:
        print(i)        # 1
                        # hello
                        # 3.14


# 자바스크립트와 마찬가지로 리스트 element는 섞어 쓸 수 있다.
    ll = [1, 2, 3] + [0, "string", 7.14]
    print(ll)            # [1, 2, 3, 0, 'string', 7.14]

# 리스트 곱연산
    ll = [1, 2, 3] * 3
    print(ll)            # [1, 2, 3, 1, 2, 3, 1, 2, 3]

    ll = 3 * [1, 2, 3]
    print(ll)            # [1, 2, 3, 1, 2, 3, 1, 2, 3]

# 리스트 -연산, ** 거듭제곱 연산은 불가능하다
    # ll = [1, 2, 3] - [1, 2]     # TypeError: unsupported operand type(s) for -: 'list' and 'list'
    # ll = [1, 2, 3] ** 3         # TypeError: unsupported operand type(s) for ** or pow(): 'list' and 'int'




# 양수 인덱스, 음수 인덱스가 가능하다.
    list1 = [11, 22, 33, 44, 55]
    print(list1)        # [11, 22, 33, 44, 55]
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



main()