# print("hello world")
# ['good']
# # 여기서 출력을 합니다.
# print('haha') # haha를 출력합니다.
'''여기는 주석입니다.'''
"""
여기도 주석입니다.
"""
# a = 'true'
#
# if a:
#     print("true")
# else:
#     print("false")
#>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<
# str = '1234567890'
# print(str)
# print(str[0:-1])
# print(str[2:-2])
# print(str[1:7:3]) #25
# print(str * 2)
# print(str + '수열')
#input("\n\n Enter를 누르십시오!")
from sys import argv, path
x = 'goods'
#sys.stdout.write(x + '\n')
#from somemodule import somefunction 하나만 인포트
#from somemodule import firstfunc, secondfunc, thirdfunc 다중 인포트
print('path', path) # path를 미리 인포트 했기 때문에, 여기서는 sys.path를 쓸 필요가 없다
counter = 100 #integer라고 생각하면 됨
miles = 1000.30 #float라고 생각하면 됨
name = "sunghyuk" #String라고 생각하면 됨
#여기서 Java랑 다른점은 앞에 Type를 쓸 필요가 없음!!!
#많이 쉽워 졌음 자바: String name = "xxx"; int counter = 100; Float miles = 1000.30
print(counter)
print(miles)
a = b = c = 100; #이렇게 해도 됨
print(a)
print(b)
print(c)
james, kitty, steven = "good", 10, 178.2 #이렇게 해도 됨 자유롭게 구현할 수 있음
print(james)
print(kitty)
print(steven)
#Number String List Tuple Set Dictionary
#Immutable Data(불가변 데이터) : Number, String, Tuple
#Variable Data(가변 데이터) : List, Dictionary, Set
#Number(int, float, bool, complex) Long은 python3버전중 삭제됨
#Type()함수는 변수가 참조하는 객체의 유형을 쿼리(Query, 查询)하는 데 사용할 수 있습니다.
print(type(james), type(kitty), type(steven)) # str, int, float
isinstance(james, str)
issubclass(bool, int)
def reverseWords(input):
    #단어를 역전하다
    inputWords = input.split(" ")#단어를 입력하고 space바로 단어 간격을 나눈다
    inputWords = inputWords[-1::-1]
    #-1은 마지막 칸의 수, 중간에 empty는 마지막칸 까지 이동한다는 뜻, 마지막 -1은 역전해서 1칸이동
    #예: 45678 ---> 8

    output = ' '.join(inputWords)
    return output

if __name__ == "__main__":
    input = 'I(me) like you'
    rw = reverseWords(input)
    print(rw)

tuple = ('good', 13, 433, "안녕")
tuple1 = ('사랑', 343)
print(tuple) #list랑 비슷함 차이는 수정을 못함
print(tuple + tuple1) #합치는 기능
#########################################################
sites = {'naver', 'yahoo', 'google', 'baidu'}
if 'facebook' in sites:
    print("yes")
else:
    print("no")
hyuk = set('abracadabra')
ha = set("sexy")

print(hyuk - ha) #차집합
print(hyuk | ha) #병집합
print(hyuk & ha) #교집합
print(hyuk ^ ha) #공집합

dic = {}
dic['number one'] = "안녕"
dic[1] = "잘 지내니?"

print(dic)
print(dic['number one'])
print(dic[1])

allDictionary = {'name' : 'leesunghyuk',
                 'age' : 23,
                 'university' : 'samyung university'}
print(allDictionary.keys());
print(allDictionary.values());