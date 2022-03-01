import fibo, sys

fibo.fibonacci_1(1000)

fibo.fibonacci_2(1000)

print(fibo.__name__)

#如果经常使用一个函数，你可以把它赋给一个本地名称：
fib = fibo.fibonacci_1
fib(1000)
print("----------------------------------------------------")
#输入声明： from modname import name1[, name2[, ... nameN]]
from fibo import fibonacci_1, fibonacci_2
#from fibo import *这样写入的话是把所有的都拿来使用 * 代表所有
#这种声明不要被过多的使用
fib(1000)

#我们在模块被引入时， 模块中的某一程序不执行， 我们可以用__name__这个属性来使该程序仅在模块自身运行时执行
if __name__ == '__main__':
    print("program is run")
else:
    print("another module")
#可以找到模块内定义的所有名称。以字符串的形式返回
print(dir(fibo))
print(dir(sys))
print(dir()) #현재 모듈안에 있는 속성 list
a = 1; #새로운 변수 추가
print(dir()) #출력값에 a가 추가 되어있는 걸 볼수 있습니다.
del a #방금 추가한것을 제거
print(dir()) #출력값에 a가 없어지는 것을 볼수 있습니다.


