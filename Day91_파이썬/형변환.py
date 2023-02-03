val1 = 4.95

print(type(val1))   # <class 'float'>

intVal = int(val1)  # 실수를 정수로 바꿀 때는 반올림 이런 것없이 무조건 내림으로 버린다.
                        # 왜냐하면 반올림하는 것보다 내림으로 하는 것이 퍼포먼스가 높기 때문이다. 연산 필요없이 소수점 비트를 버리기만 하면 되니까
                        # 따라서 반올림, 내림, 올림을 하고 싶으면 별도의 라이브러리를 써야한다.

print(intVal)       # 4
print(type(intVal)) # <class 'int'>