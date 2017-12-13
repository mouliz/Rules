package com.dev.neo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {
	public static void main(String[] args) {
	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	   ctx.register(AppConfig.class);
	   ctx.refresh();
	   Processor processor = ctx.getBean(Processor.class);
	   	}
}
