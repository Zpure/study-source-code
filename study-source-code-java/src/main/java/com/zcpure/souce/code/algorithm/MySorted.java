package com.zcpure.souce.code.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * @author ethan
 * @create_time 2019/4/15 15:39
 */
public class MySorted<T extends Comparable> {
	/**
	 * 冒泡排序
	 */
	public void bubbleSort(List<T> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size() - 1; j++) {
				// 比较相邻两个位置的值大小
				if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
					this.exchange(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * 插入排序
	 */
	public void insertSort(List<T> arr) {
		for (int i = 1; i < arr.size(); i++) {
			// 待插入值
			T insertVal = arr.get(i);
			// 待比较位置
			int insertIndex = i - 1;
			// 比较当前值与待插入位置值大小，小于就向前比较  直到insertIndex小于0
			while (insertIndex >= 0 && insertVal.compareTo(arr.get(insertIndex)) < 0) {
				arr.set(insertIndex + 1, arr.get(insertIndex));
				insertIndex--;
			}
			arr.set(insertIndex + 1, insertVal);
		}
	}

	/**
	 * 快速排序
	 */
	public void fastSort(List<T> arr, int low, int high) {
		// 当前待比较的值
		T sortedKey = arr.get(low);
		int start = low;
		int end = high;
		while (start < end) {
			// 找到列表右侧小于当前数的值  并交换
			while (start < end && arr.get(end).compareTo(sortedKey) >= 0) {
				end--;
			}
			if (arr.get(end).compareTo(sortedKey) < 0) {
				exchange(arr, start, end);
			}

			// 找到列表左侧大于当前数的值  并交换
			while (start < end && arr.get(start).compareTo(sortedKey) <= 0) {
				start++;
			}
			if (arr.get(start).compareTo(sortedKey) > 0) {
				exchange(arr, start, end);
			}
		}
		// 找寻找比较直的位置后  递归比较
		if (low < start) {
			this.fastSort(arr, low, start - 1);
		}
		if (high > end) {
			this.fastSort(arr, end + 1, high);
		}
	}

	/**
	 * 交换列表两个位置的值
	 * @param arr
	 * @param i
	 * @param j
	 */
	public void exchange(List<T> arr, int i, int j) {
		T temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	public static void main(String[] arr) {
		List<Integer> list = Arrays.asList(12, 14, 84, 484, 4, 44, 65, 889, 45);
//		new MySorted<Integer>().insertSort(list);
		new MySorted<Integer>().fastSort(list, 0, list.size() - 1);
		for (Object s : list) {
			System.out.println(s);
		}
	}
}
