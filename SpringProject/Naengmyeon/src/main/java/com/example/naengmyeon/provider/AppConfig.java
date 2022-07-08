package com.example.naengmyeon.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.naengmyeon.hello.ConfigurableMessageProvider;
import com.example.naengmyeon.hello.MessageProvider;
import com.example.naengmyeon.hello.MessageRenderer;
import com.example.naengmyeon.hello.StandardOutMessageRenderer;

@Configuration
public class AppConfig {
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
