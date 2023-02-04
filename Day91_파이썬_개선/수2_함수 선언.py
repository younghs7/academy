
def greeting(name):
    print("Hello", name)
    print(name, "Welcome to python")
    return 100


x = greeting("아하!")    # Hello 아하!
                        # 아하! Welcome to python

print(x)                # 100


def add(num1, num2):
    return num1 \
        + num2 \
        + 3             # 줄 넘길 때 \ 해줘야함


sum1 = add(3, 2)
print(sum1)             # 8
