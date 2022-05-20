package com.kr.prospring5.ch2.decoupled;

public class HelloWorldCoupled {
	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		
		mr.setMessageProvider(mp);// MessageProvider를 MessageRenderer에 전달한다.
		mr.render(); //MessageRenderer.render()로 Hello World 호출한다.
	}

}
