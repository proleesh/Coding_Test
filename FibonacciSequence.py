#Fibonacci Sequence
a, b = 0, 1 #初始赋予值
while b < 100000: #当条件是b < 100000时
    print(b, end=' ') #end是为了让数字形成一行输出(没有end情况下，是列输出) equals（=）后面是给予用什么方式隔开 这里我们用space（空格）隔开
    a, b = b, a + b

#우선 우측에 있는 표현식을 계산하다
#a + b = n
#b = m
#b = n (因为a + b = n,所以相对应的是左侧的b。）
#a = m （因为b = m，所以相对应的是左侧的a。）

