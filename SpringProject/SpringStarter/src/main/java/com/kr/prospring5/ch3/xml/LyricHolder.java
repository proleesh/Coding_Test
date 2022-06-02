package com.kr.prospring5.ch3.xml;

import com.kr.prospring5.ch3.ContentHolder;

public class LyricHolder implements ContentHolder{
	
	private String value = "'You be the DJ, I'll be the driver'";

	@Override
	public String toString() {
		return "LyricHolder [value=" + value + "]";
	}
	
	

}
