package com.zcpure.source.code;

/**
 * @author ethan
 * @create_time 2019/5/8 9:48
 */
public class ParamsTest {

	private final int object;

	public ParamsTest() {
		this.object = 1;
	}

	public static void changeParams(Integer integer, int i, String s, StringBuilder builder) {
		integer = integer + 1;
		i = i + 1;
		s = s + "1";
		builder = builder.append(1);
//		builder.append('1');
	}

	public static void main(String[] args) {
		Integer integer = new Integer(1);
		int i = 1;
		String s = new String("String");
		StringBuilder builder = new StringBuilder("StringBuilder");
		System.out.println(integer);
		System.out.println(i);
		System.out.println(s);
		System.out.println(builder);
		ParamsTest.changeParams(integer, i, s, builder);
		System.out.println(integer);
		System.out.println(i);
		System.out.println(s);
		System.out.println(builder);

	}
}
