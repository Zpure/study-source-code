package com.zcpure.souce.code.jvm;

/**
 * @author ethan
 * @create_time 2019/5/8 11:39
 */
public class LoadOrder {

	public static class Parent {
		static {
			System.out.println("Parent");
		}

		public static int value = 123;
	}

	public static class Child extends Parent {
		static {
			System.out.println("Child");
		}

		public static int c_value = 1234;
	}

	//mian 中执行
	public static void main(String[] args) {
		//记得分别注释运行，不然 Parent 被初始化了，就看不到效果了
		System.out.println(Child.value);
		System.out.println(Child.c_value);
	}
}
