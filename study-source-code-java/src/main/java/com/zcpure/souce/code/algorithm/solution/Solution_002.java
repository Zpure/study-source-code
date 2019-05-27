package com.zcpure.souce.code.algorithm.solution;

/**
 * @author ethan
 * @create_time 2019/5/24 17:39
 *
 *
 *
 *
 */
public class Solution_002 {

	/**
	 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
	 * @param args
	 * @return
	 */
	public static int getSingle(int[] args) {
		int result = 0;
		for(int i = 0; i< args.length; i++) {
			result = result ^ args[i];
		}
		return result;
	}

	/**
	 * 有一个 n 个元素的数组，除了两个数只出现一次外，其余元素都出现两次，让你找出这两个只出现一次的数分别是几，要求时间复杂度为 O(n) 且再开辟的内存空间固定(与 n 无关)
	 *
	 * 题目再解析 根据前面找一个不同数的思路算法，在这里把所有元素都异或，那么得到的结果就是那两个只出现一次的元素异或的结果。然后，因为这两个只出现一次的元素一定是不相同的，所以这两个元素的二进制形式肯定至少有某一位是不同的，即一个为 0 ，另一个为 1 ，现在需要找到这一位。根据异或的性质 任何一个数字异或它自己都等于 0，得到这个数字二进制形式中任意一个为 1 的位都是我们要找的那一位。再然后，以这一位是 1 还是 0 为标准，将数组的 n 个元素分成两部分。将这一位为 0 的所有元素做异或，得出的数就是只出现一次的数中的一个将这一位为 1 的所有元素做异或，得出的数就是只出现一次的数中的另一个。这样就解出题目。忽略寻找不同位的过程，总共遍历数组两次，时间复杂度为O(n)。
	 *
	 */
	public static int getSingle2(int[] args) {
		int result = 0;
//		TODO
		return result;
	}

	/**
	 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
	 */
	public static boolean isPower2(int i) {
		return (i > 0) && (i & (i - 1)) == 0;
	}


	/**
	 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
	 *
	 * 找一下规律： 4 的幂次方的数的二进制表示 1 的位置都是在奇数位。
	 * 之前在判断一个是是否是 2 的幂次方数使用的是位运算 n & ( n - 1 )。
	 * 同样的，这里依旧可以使用位运算：将这个数与特殊的数做位运算。
	 * 这个特殊的数有如下特点：足够大，但不能超过 32 位，
	 * 即最大为 1111111111111111111111111111111（ 31 个 1）它的二进制表示中奇数位为 1 ，偶数位为 0
	 * 符合这两个条件的二进制数是：1010101010101010101010101010101如果用一个 4 的幂次方数和它做与运算，
	 * 得到的还是 4 的幂次方数。将这个二进制数转换成 16 进制表示：0x55555555 。
	 *
	 */
	public static boolean isPower4(int num) {
		if (num <= 0)
			return false;
		//先判断是否是 2 的幂
		if ((num & num - 1) != 0)
			return false;
		//如果与运算之后是本身则是 4 的幂
		if ((num & 0x55555555) == num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int[] params = new int[]{1, 3, 1, 8, 3};
//		System.out.println(getSingle(params));
		System.out.println(isPower2(3));
	}
}
