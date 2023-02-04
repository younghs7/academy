

def main():

# 문자열에서 찾는 문자열의 개수를 리턴
    str = "ABCDEFG"
    print(str.count("G"))   # 1

    str = "ABCDEFGGG"
    print(str.count("G"))   # 3

# 문자열을 소문자로, 대문자로
    print(str.lower())
    print(str.upper())


# 문자열의 공백 제거
    str1 = "      AAA     "
    print(str1 + "a")                   #       AAA         a
    print(str1.lstrip() + "a")          #AAA        a
    print(str1.rstrip())                #       AAA

# replace() --> 문자열의 변경
    str2 = "AAaemnvndAA"

    newStr2 = str2.replace("AA", "__")      # __aemnvnd__
    print(newStr2)

    print(str2.replace("AA", "__", 1))      # __aemnvndAA

    # 파이썬은 문자열 리터럴을 만드면 전역 영역에 할당된다.
    # 전역 영역에 올라가면 프로세스가 끝날 때까지 사라지면 안 되기 때문에 lead only만 되게끔 한다.
    # 그래서 파이썬에서 replace()가 원본문자열을 수정하지 않고 새로운 문자열을 뱉어내는 이유이다.

# 문자열 자르기
    str3 = "aa bb cc"
    strList = str3.split()      # parameter 안 넣으면 기본 공백 기준으로 짜름름
    print(strList)              # ['aa', 'bb', 'cc']

    str4 = "aa_bb_cc_dd"
    strList = str4.split('_')   # ['aa', 'bb', 'cc', 'dd']
    print(strList)


# 문자열 찾기 find()
    str5 = "he is so busy"

    print(str5.find('is'))      # 3
    print(str5.find('fff'))     # -1
    print(str5.rfind('is'))     # 3     --> 뒤에서부터 발견되는 첫번째를 리턴 indexOfLast()랑 같네.





# 번외 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

# del 명령어 (스트링 제한인 건 아님)
    ll = [1, 2, 3, 4]
    ll.clear()                  # 내용을 삭제함
    print(ll)                   # []


    ll = [1, 2, 3, 4]
    del ll[:]
    print(ll)                   # []
    del ll
    print(ll)                   # 존재 자체를 없앰

# 파이썬은 기본적으로 자료구조에 클리어링을 하는 여러가지를 제공한다.

# ============================================================





main()