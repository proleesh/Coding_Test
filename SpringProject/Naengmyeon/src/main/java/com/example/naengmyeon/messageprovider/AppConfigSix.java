package com.example.naengmyeon.messageprovider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.naengmyeon.hello.ConfigurableMessageProvider;
import com.example.naengmyeon.hello.MessageProvider;

@Configuration
public class AppConfigSix {
	@Bean
	public MessageProvider provider() {
		return new ConfigurableMessageProvider("Love on the weekend");
		
	}

}
