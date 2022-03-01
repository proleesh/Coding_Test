import sys

print('command parameters are as follows: ')
for i in sys.argv:#sys.argv是查找项目所在路径参数（包含命令行参数的列表）
    print(i)
#i在sys.argv中查找路径参数
print("\n\nPython path: ", sys.path, '\n') #sys.path是查找Python项目所在路径
