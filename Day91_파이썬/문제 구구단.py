
def gugudan(dan):
    dan = eval(dan)
    mul = 1
    for i in range(0, 9):
        print(dan, "x", mul, "=", dan * mul)
        mul = mul + 1


num = input("단을 입력하시오")
gugudan(num)