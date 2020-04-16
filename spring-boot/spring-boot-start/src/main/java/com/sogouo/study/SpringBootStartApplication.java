package com.sogouo.study;


/**
 *
 * Container 之前 (拦截器或者过滤器)-> Servlet
 *
 * FilterChain (责任链模式):
 * 		1、日志
 * 		2、
 *
 *		使用:
 * @Compant
 *
 *
 *
 *
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApplication.class, args);
	}

}
