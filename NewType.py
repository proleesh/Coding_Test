num_int = 123
num_flo = 1.23

num_new = num_int + num_flo

print("datatype of num_int: ", type(num_int))
print("datatype of num_flo: ", type(num_flo))

print("Value of num_new: ", num_new)
print("datatype of num_new: ", type(num_new))

num_str = "456"
print("datatype of num_str: ", type(num_str))

x = int(1)
y = int(2.8)
z = int("3")
print("x: ", x)
print("y: ", y)
print("z: ", z)

print("num_int type: ", type(num_int))
print(" before, num_str type: ", type(num_str))
num_str = int(num_str)#在这里我们可以转换成int类型
print(" after, num_str type: ", type(num_str))
num_sum = num_int + num_str #여기서 우리가 방금 num_str를 int타입으로 바꾸면서 int타입이됩니다.
#그래서 여기 num_int + num_str 는 int타입이 출력됩니다.
print(" num_int + num_str = ", num_sum)
print("num_sum type: ", type(num_sum))
