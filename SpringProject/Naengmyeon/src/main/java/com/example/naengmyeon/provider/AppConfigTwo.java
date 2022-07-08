package com.example.naengmyeon.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.naengmyeon.hello.MessageProvider;
import com.example.naengmyeon.hello.MessageRenderer;
import com.example.naengmyeon.hello.StandardOutMessageRenderer;

@Configuration
@ComponentScan(basePackages= {"com.example.naengmyeon.provider"})
public class AppConfigTwo {
	@Autowired
	MessageProvider provider;
	
	@Bean(name="messageRenderer")
	public MessageRenderer messageRenderer() {
			MessageRenderer renderer = new StandardOutMessageRenderer();
			renderer.setMessageProvider(provider);
			return renderer;
	}

}
