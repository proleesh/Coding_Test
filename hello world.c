#include <stdio.h>
//引入头文件

//以下是main函数，是程序的执行入口
void main() {//m字母一定要小写不能大写
	//printf是一个函数， 需要一个头文件才可以使用
	//这里我们的头文件为<stdio.h> 一定一定不要打成<studio.h> 没有u
	//我们的代码是从<stdio.h>这里面提取这里包含逻辑代码 其中包括printf
	printf("hello, world!\n");
	printf("HYUK\tHA\n");
	//JAVA의 출력방식
	//System.out.print("good");
	getchar(); //让窗口停留
//	int a = 100;
//	for (a; a <= 499; a++) {
//		printf("test = %d ", a);
//	};
//	getchar();
	printf("이름\t나이\t성별\t학교\n이성혁\t24\t남자\t세명대학교 \n");

	int car = 100;
	printf("차의 가격 : %d", car);

	//编辑edit：编写我们（.c）文件， 就是源代码
	//编译compiler：将（.c）程序翻译成目标文件（.obj）在计算机底层执行
	//链接link：将目标文件 （.obj） 文件 生成可执文件
	//运行run： 执行 .exe文件， 得到运行结果
	return 0; //终止main函数 并返回值0

};