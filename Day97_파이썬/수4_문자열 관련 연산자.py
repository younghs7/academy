
def main():

    str = "ABCDEFGH"

# 문자열 * 연산자
    print(str * 3)          # ABCABCABC

# 문자열 인덱스 연산자
    print(str[1])           # B

# 슬라이싱 연산이 가능하다. (인덱스가 되니 슬라이싱도 당연히 되는 게 당연)
    print(str[1:3])         # BC

    print(str[0:7:2])       # ACEG

# 문자열에 담긴 내용을 바꾸는 것은 가능하지만 string[index]에 할당은 안 된다.
    str = "abc"
    print(str)                  # abc
    # str[1] = "d"              # TypeError: 'str' object does not support item assignment



main()