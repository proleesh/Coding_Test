package com.co.shl.main;

import com.co.shl.beans.HelloWorld;
import com.co.shl.beans.HelloWorldEn;
import com.co.shl.beans.HelloWorldKo;

public class Main {
	public static void main(String[] args) {
		//객체를 중복해서 생성해야 하기 때문에 우리는 Spring Framework을 쓴다
		HelloWorld hellowden = new HelloWorldEn();
		//Interface varName = new Class();
		callMethod(hellowden);
		//method(varName);
		
		HelloWorld hellowdko = new HelloWorldKo();
		callMethod(hellowdko);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
