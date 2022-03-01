#Defination Fibonacci
#fibonacci_1:
def fibonacci_1(n):
    a, b = 0, 1
    while b < n:
        print(b, end=" ")
        a, b = b, a + b
    print()

#Return Fibonacci
#fibonacci_2:
def fibonacci_2(n):
    result = []
    a, b = 0, 1
    while b < n:
        result.append(b) #result.附加
        a, b = b, a + b
    return result