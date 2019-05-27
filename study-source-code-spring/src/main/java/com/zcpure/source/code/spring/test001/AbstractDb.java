package com.zcpure.source.code.spring.test001;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ethan
 * @create_time 2019/5/22 10:14
 */
public abstract class AbstractDb {
	@Autowired
	private DBService dbService;

	public final Object getConnect() {
		dbService.getPropertis();
		System.out.println("getConnect");
		return null;
	}

	public abstract Object getData();
}
