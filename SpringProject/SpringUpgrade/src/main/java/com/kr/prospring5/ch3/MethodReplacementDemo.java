package com.kr.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		
		ReplacementTarget replacementTarget = (ReplacementTarget)ctx.getBean("replacementTarget");
		ReplacementTarget standardTarget = (ReplacementTarget)ctx.getBean("standardTarget");
		
		displayInfo(replacementTarget);
		displayInfo(standardTarget);
		
	}

	private static void displayInfo(ReplacementTarget replacementTarget) {
		System.out.println(replacementTarget.formatMessage("Thanks for playing, try again!"));
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("perTest");
		
		for(int x=0;x<100000;x++) {
			String out = replacementTarget.formatMessage("No filter in my head");
			
		}
		stopWatch.stop();
		System.out.println("100000번 수행 시 걸린 시간: " + stopWatch.getTotalTimeMillis() + " ms");
	}

}
