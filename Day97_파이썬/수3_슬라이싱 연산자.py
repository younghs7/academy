

def main():

    tList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

    newList = tList[0:9:2]
    print(newList)      # [1, 3, 5, 7, 9]

    newList = tList[0:9:1]
    print(newList)      # [1, 2, 3, 4, 5, 6, 7, 8, 9]

    # 즉 [0:9] 는 [0:9:1] 이 생략된 것

    # 이런 식으로 된다.
    newList = tList[0::2]
    print(newList)          # [1, 3, 5, 7, 9, 11, 13]

    newList = tList[::2]
    print(newList)          # [1, 3, 5, 7, 9, 11, 13]

    newList = tList[::]
    print(newList)          # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

main()