package com.hht.myBatisSpringbootDemo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyBatisSpringbootDemoApplication {

	public static void main(String[] args) {
		// 验证c3p0数据源是否生效
		ConfigurableApplicationContext ctx = SpringApplication.run(MyBatisSpringbootDemoApplication.class, args);
		DataSource dataSource = ctx.getBean(DataSource.class);
		
		System.out.println(dataSource.getClass());
	}

}
