package com.example.naengmyeon.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.example.naengmyeon.hello.ConfigurableMessageProvider;
import com.example.naengmyeon.hello.MessageProvider;
import com.example.naengmyeon.hello.MessageRenderer;
import com.example.naengmyeon.hello.StandardOutMessageRenderer;

@Configuration
@PropertySource(value="classpath:message.properties")
public class AppConfigOne {
	
	@Autowired
	Environment env;
	
	@Bean
	public MessageProvider messageProvider() {
		return new ConfigurableMessageProvider(env.getProperty("message"));
	}
	
	@Bean(name = "messageRenderer")
	@Scope(value="prototype")
	@DependsOn(value="messageProvider")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(messageProvider());
		return renderer;
	}

}
