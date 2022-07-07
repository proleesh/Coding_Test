package com.example.naengmyeon.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

public class MessageDigesterConfigDemo {
	@Configuration
	static class MessageDigesterConfig{
		@Bean
		public MessageDigestFactoryBean shaDigest() {
			MessageDigestFactoryBean factoryOne = new MessageDigestFactoryBean();
			factoryOne.setAlgorithmName("SHA1");
			return factoryOne;
		}
		
		@Bean
		public MessageDigestFactoryBean defaultDigest() {
			return  new MessageDigestFactoryBean();
		}
		
		@Bean MessageDigester digester() throws Exception{
			MessageDigester messageDigester = new MessageDigester();
			messageDigester.setDigest1(shaDigest().getObject());
			messageDigester.setDigest2(defaultDigest().getObject());
			return messageDigester;
		}
		
	}
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(MessageDigesterConfig.class);
		MessageDigester digester = (MessageDigester)ctx.getBean("digester");
		digester.digest("Hello World!");
		ctx.close();
	}

}
