package com.example.naengmyeon.shutdown;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShutdownHookBean implements ApplicationContextAware{
	private ApplicationContext ctx;
	

	/**
	 * @Implements {@link ApplicationContextAware #setApplicationContext(ApplicationContext)}
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(ctx instanceof GenericXmlApplicationContext) {
			((GenericXmlApplicationContext) ctx).registerShutdownHook();
		}
		
	}
	

}
