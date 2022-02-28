#반복자, 생성자 迭代器， 生成器 iter next generator
import sys #sys 모듈를 인포트한다 引入sys模块
# list = [1, 2, 3, 4] #给list对象输列入值
# it_er = iter(list) #(iter)반복자객체생성 生成it_er对象 并使用迭代器（iter）方法
# print(next(it_er)) #다음iter출력
# print(next(it_er))
# for x in it_er: #순서대로 출력
#     print(x, end=" ")#1 2 3 4 출력
# while True: #当是True值
#     try:#尝试
#         print(next(it_er))
#     except StopIteration: #例外 停止互动（Stop Interation）
#         sys.exit()#退出
#클래스를 반복자로 사용하려면, 클래스에서 두 메서드를 실행가능해야한다.
#그중에 __iter__(), __next__()
# 把一个类作为一个迭代器使用需要在类中实现两个方法__iter__(),  __next__()
# class MyNumbers:
#     def __iter__(self): #__iter__메서드
#         self.a = 1
#         return self
#     def __next__(self):
#         x = self.a
#         self.a += 1
#         return x
# myclass = MyNumbers()
# myiter = iter(myclass)
# print(next(myiter))
# print(next(myiter))
# print(next(myiter))
# print(next(myiter))
# print(next(myiter))
# class MyNums:
#     def __iter__(self):
#         self.a = 1
#         return self
#     def __next__(self):
#         if self.a <= 20:
#             x = self.a
#             self.a += 1
#             return x
#         else:
#             raise StopIteration
# myclass = MyNums()
# myiter = iter(myclass)
# for x in myiter:
#     print(x)
def fibonacci(n): #생성자 함수 --- 피보나치
    a, b, counter = 0, 1, 0
    while True:
        if(counter > 0):
            return
        yield a
        a, b = b, a + b
        counter += 1
f = fibonacci(10) #f는 반복자이고, 생성자가 return하면서 생성

while True:
    try:
        print(next(f), end=" ")
    except StopIteration:
        sys.exit()


