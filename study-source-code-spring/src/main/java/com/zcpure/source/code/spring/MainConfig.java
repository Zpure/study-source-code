package com.zcpure.source.code.spring;

import com.zcpure.source.code.spring.test001.MysqlDb;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ethan
 * @create_time 2019/5/22 10:19
 */
@Configuration
@ComponentScan({"com.zcpure.source.code.spring"})
public class MainConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		MysqlDb bean = applicationContext.getBean(MysqlDb.class);
		System.out.println(bean);
		bean.getData();
	}
}
