# a = 1
# while a <= 9:
#     print(a, end=" ")
#     a += 2

# for a in range(100): #100이내의 숫자 100은 포함하지 않음
#     print(a, end=" ")
# for b in range(6, 100):#6부터시작해서 100이내에 있는 숫자 6은 포함되는데 100은 포함되지 않음
#     print(b, end=" ")

# for c in range(1, 10, 3): #1부터시작해서 10이내에 있는 숫자를 3칸식
#     print(c, end=" ")# 1을 3칸식 --> 4을 3칸식 --> 7을 3칸식 -->10(무효, 10이내라서 그리고10은 포함되지 않음)

# for i in range(-10, -100, -30): #-10부터시작해서 -100이내에 있는 숫자를 -30칸식
#     print(i, end=" ") #결과는 -10, -40, -70
# website = ['google', 'baidu', 'yahoo', 'oracle', 'alibaba', 'tencent', 'naver', 'apache']
# for i in range(len(website)): #range()是范围的代码， 其中len(value)是长度的代码， value填写你所设定的对象这里我们用website
#     print(i, website[i], end=" ")#以序列的方式列出 从零开始（计算机第一个位置（Access）都是从零开始） 然后以行的形式输出
    #结果为 0 google 1 baidu 2 yahoo 3 oracle 4 alibaba 5 tencent 6 naver 7 apache

# for site in website:
#     if len(site) != 4:
#         continue
#     print(f"hello,{site}")
#
#     if site == "yahoo":
#         break
#     print("finish")

n = 5
while n > 0: #当条件n大于0时，执行以下语句
    n -= 1 #n - 1 = 多少 先走公式5 - 1 = 4， 之后执行4 - 1 = 3（因为不满足以下条件，所以下面语句不执行）
    if n == 2: #如果n等于2时
        # break(休息），执行以下语句
        break
    print(n)#输出n值 这里我们先获得4 之后获得3。
print("return ending") #结束后输出

for site in 'kakao': #site在kakao中
    if site == 'o':#如果条件site中有等于o那么执行一下语句
        break#休息
    #我们在这里把‘k' ’a' ‘k’ ‘a’都执行过后（因为前面几个不满足条件）最后‘o’再执行
    print('현재의 영문자: ', site)#输出 k a k a
var = 10
while var > 0:#条件时当var都大于0时， 执行以下语句
    print("현재의 변수는: ", var)
    var = var - 1;
    if var == 5: #当满足 var == 5 时
        break#休息
print("end")#输出结束

for letter in 'Tencent':
    if letter == 'c': #如果letter中有c那么执行以下语句
        continue#继续
    print("Current English alphabet: ", letter) #输出 T e n e n t
a = 10
while a > 0:
    a = a - 1
    if a == 5: #变量为5时跳过
        continue#继续
    print("Current var: ", a)
print("ending")
#소수구하기:
for n in range(2, 10): #n在2和10之间范围内
    for x in range(2, n): #x在2和n之间范围内
        if n % x == 0: #n 除以 x 等于 0的情况下 执行以下语句
            print(n, "equals", x, "*", n//x)
            break;
    else:
        print(n, " 는 소수 입니다.")
#pass상용법
for language in 'Korean':
    if language == 'a':
        pass
        print("run pass")
    print("Current English Alphabet: ", language)
