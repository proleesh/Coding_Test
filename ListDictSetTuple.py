#LIST유도
#[표현식 for 변수 in 리스트]
#[out_exp_res for out_exp int input_list]
#[표현식 for 변수 in 리스트 if 조건]
#[out_exp_res for out_exp in input_list if condition]

#在这里我们设置姓名（names）一个列表
LAST_names = ['LEE', 'KIM', 'PARK', 'KWAK', 'CHOI']
new_names = [name.upper()for name in LAST_names if len(name)>3] #姓名长度超过3的 这里len是length的简称代表长度的意思
print(new_names)#所以在这里输出值为 PARK, KWAK, CHOI （因为这里LEE和KIM是长度为3的文字所以除外）

multiples = [i for i in range(30) if i % 3 == 0]
#从0开始到30以下的数字列， 然后能被三整除的数字(这里包括开头0）
print(multiples)#输出结果则为： [0, 3, 6, 9, 12, 15, 18, 21, 24, 27]

#=================================================================================================================

#DICT유도
#{key_expr: value_expr for value in collection}
#{표현식: 조건값 for 값 in 리스트}
#{표현식: 조건값 for 값 in 리스트 if 조건}
#{key_expr: value_expr for value in collection if condition}
listdemo = ['Google', 'Baidu', 'Naver']
newdict = {key:len(key) for key in listdemo}
newdict = {'Google':6, 'Baidu':6, 'Naver':6}
print(newdict)
dic = {x: x**2 for x in (2, 4, 6)}
#괄호()안에있는 숫자를 모두 제곱한 값을 각각 표현
#2의제곱: 4, 4의제곱: 16, 6의제곱: 36
dic1 = {x: x**3 for x in (1, 3, 5)}
#숫자를 모두 3제곱한 값을 각각 표현
#1의 3제곱: 1, 3의 3제곱: 27, 5의 3제곱: 125
print(dic)#출력 값 2: 4, 4: 16, 6: 36
print(dic1)#출력 값 1: 1, 3: 27, 5: 125
print(type(dic)) #타입 살펴보기 결과: DICT
print(type(dic1)) #타입 살펴보기 결과: DICT

#=================================================================================================================

#SET유도
#{expression for item in Sequence}
#{expression for item int Sequence if conditional}
setnew = {i**2 for i in (1,2,3)}#dict처럼 똑같이 여기서 i**2은 제곱의 뜻으로
#1의 제곱 = 1, 2의 제곱 = 4, 3의 제곱 = 9
print(setnew) # {1, 4, 9}

a = {x for x in "abracadabra" if x not in 'abc'} #abc가 아닌 영문자
print(a) #결과 r d
b = {y for y in "hfusnalfjeoihf" if y not in 'hfal'} #hfal가 아닌 영문자
print(b)
print(type(a))#set 타입
print(type(b))#set 타입

#=================================================================================================================

#TUPLE유도
#(expression for item in Sequence)
#(Expression for item in Sequence if conditional)
k = (x for x in range(1, 10))
print(k) #생성자 객체를 리턴(return)합니다.

print(tuple(k)) #여기서 tuple를 사용하면 만들어진 생성자객체를 TUPLE로 전환합니다.
#결과: 1, 2, 3, 4, 5, 6, 7, 8, 9(10이하 숫자)

