

def main():

    list = [11, 22, 33, 44, 55]

# len(list)
    print(len(list))        # 5

# max(list), min(list)
    print(max(list))        # 55
    print(min(list))        # 11

# list.remove(element) --> 해당값을 찾아서 삭제
    list.remove(33)
    print(list)             # [11, 22, 44, 55]

# list.append(element) --> 끝에 추가함.
    list.append(33)
    print(list)  # [11, 22, 44, 55, 33]

# list.pop(index) or pop()
    print(list.pop(1))      # 22
    print(list)             # [11, 44, 55, 33]

    print(list.pop())       # 33
    print(list)             # [11, 44, 55]


main()