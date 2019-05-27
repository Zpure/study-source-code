package com.zcpure.souce.code.algorithm.solution;

/**
 * @author ethan
 * @create_time 2019/4/22 16:50
 * <p>
 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * <p>
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 * <p>
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1
 */
public class Solution_001 {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		for (int i = 0; i < gas.length; i++) {
			int gasMargin = 0;
			boolean qualified = true;
			for (int j = 0; j < gas.length; j++) {
				int index = (i + j) % gas.length;
				gasMargin = gasMargin + gas[index] - cost[index];
				if (gasMargin < 0) {
					qualified = false;
					break;
				}
			}
			if (qualified) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] gas = {2, 3, 4};
		int[] cost = {3, 4, 3};
		System.out.println(Solution_001.canCompleteCircuit(gas, cost));
	}
}
