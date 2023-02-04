def main():

    list2 = [4, 66, 33, 5, 7, 1]

    part = list2[2:5]
    print(part)     # [33, 5, 7]

    list2[4] = 0
    print(list2[4])  # 0

    list2[2:5] = [222, 222, 222]
    print(list2)     # [4, 66, 222, 222, 222, 1]

    list2[:3] = [1, 2, 3]
    print(list2)     # [1, 2, 3, 222, 222, 1]

    list2[3:] = [0, 0, 0, 0]
    print(list2)     # [1, 2, 3, 0, 0, 0, 0]

    list2[:] = [0, 0, 0, 0]
    print(list2)     # [0, 0, 0, 0]

    list2 = [1, 2, 3, 4, 5]
    print(list2)     # [1, 2, 3, 4, 5]


main()
