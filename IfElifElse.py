#python中没有Java或者C里的switch和case语句， 大大的简化了我们的编程麻烦度
#我们用If elif else等就可以解决这些问题
#在这里我们给var赋予值
var1 = 100
if var1:
    print("ture")
    print(var1)
var2 = 0
if var2:
    print("ture")
    print(var2)
print("good bye")
#以上输出结果只有var1的ture值，没有var2的值是因为赋予值为0时这个条件无效不执行。
#所以直接绕过var2的过程直接跳到输出print（“good bye”）

#=========================================================================================================

#这里我们做个简单的输入输出程序
age = int(input("Please enter your dogs age: "))
print("")
if age <= 0:
    print("Error")
elif age == 1:
    print("=humans age 14")
elif age == 2:
    print("=humans age 22")
elif age > 2:
    human = 22 + (age - 2)*5
    print("=humans age ", human)

#exit tip
input("Plase Enter key")
print("계산종료")

#==================================================================================================================

number = 7 #设定默认值 用于比较
guess = 1 #设定一个初始值 用于进行游戏
#注意 : 没有guess时会出现 error（错误）
print("Random numbers game!")
while guess != number: #这里条件是， 当 guess这个值和number不等同时 执行下列语句
    #!= ： 不等于的意思（相反==时等于的意思）
    guess = int(input("Please enter your numbers: "))
    #请输入你的值
    if guess == number: #如果你输入的值和你设定的值7相等，那么你成功了。
        print("Perfect! you win")#输出值 非常棒， 你获胜了
    elif guess < number: #如果你输入的值和你设定的值7不等而且小于7， 那么你的值比7小。
        print("Your numbers is too small")#输出值 你输入的值太小了
    elif guess > number:#如果你输入的值和你设定的值7不等而且大于7， 那么你的值比7大。
        print("Your numbers is too big")#输出值 你输入的值太大了

#==================================================================================================================

num = int(input("Please enter your numbers: "))
if num%2 == 0:
    if num%3 == 0:
        print("당신이 입력한 숫자는 2, 3을 모두 나눌수 있습니다. ")
    else:
        print("당신이 입력한 숫자는 2만 나눌수 있습니다. 3은 안됨!!!")
else:
    if num%3 == 0:
        print("당신이 입력한 숫자는 3만 나눌수 있습니다. 2은 안됨!!!")
    else:
        print("당신이 입력한 숫자는 2만 나눌수 있습니다. 3은 안됨!!!")