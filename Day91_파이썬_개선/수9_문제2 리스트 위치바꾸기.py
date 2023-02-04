
def exchangeList(list2):
    temp = 0
    length = len(list2)

    for i in range(0, (length // 2)):
        temp = list2[i]
        list2[i] = list2[length - 1 - i]
        list2[length - 1 - i] = temp



# 파이썬에서 필수 사항은 아닌데, 가독성을 높이기 위해서 씀.
def main():
    list1 = [4, 66, 33, 5, 7, 1]
    exchangeList(list1)

    print(list1)

main()