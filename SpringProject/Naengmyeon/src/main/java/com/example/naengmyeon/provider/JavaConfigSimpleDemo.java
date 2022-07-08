package com.example.naengmyeon.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.naengmyeon.hello.ConfigurableMessageProvider;
import com.example.naengmyeon.hello.MessageProvider;
import com.example.naengmyeon.hello.MessageRenderer;
import com.example.naengmyeon.hello.StandardOutMessageRenderer;

public class JavaConfigSimpleDemo {
	@Configuration
	static class AppConfigOne {
		@Bean
		public MessageProvider messageProvider() {
			return new ConfigurableMessageProvider();
		}

		@Bean
		public MessageRenderer messageRenderer() {
			MessageRenderer renderer = new StandardOutMessageRenderer();
			renderer.setMessageProvider(messageProvider());
			return renderer;
		}

	}

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigOne.class);
		MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();
	}
}