package com.zcpure.source.code.spring.test001;

import org.springframework.stereotype.Service;

/**
 * @author ethan
 * @create_time 2019/5/22 10:17
 */
@Service
public class MysqlDb extends AbstractDb {
	@Override
	public Object getData() {
		getConnect();
		System.out.println("getData");
		return null;
	}


}
