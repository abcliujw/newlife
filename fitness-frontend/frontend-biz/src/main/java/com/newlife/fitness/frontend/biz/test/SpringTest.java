package com.newlife.fitness.frontend.biz.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	@Test
	public void test() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring-biz.xml");
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
	}
}
