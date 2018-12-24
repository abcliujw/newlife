package com.newlife.fitness.frontend.biz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring-biz.xml");
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
	}
}
