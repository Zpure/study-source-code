package com.zcpure.souce.code;

/**
 * @author ethan
 * @create_time 2019/5/22 9:44
 */
public class OperationTest extends OperationMysql {

	@Override
	public Object getData() {
		return "OperationTest";
	}

	public static void main(String[] args) {
		OperationTest test = new OperationTest();
		test.getConnect();
	}
}
