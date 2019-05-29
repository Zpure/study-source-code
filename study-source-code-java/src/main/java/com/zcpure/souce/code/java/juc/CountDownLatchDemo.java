package com.zcpure.souce.code.java.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ethan
 * @create_time 2019/5/27 17:59
 */
public class CountDownLatchDemo {
	private static ExecutorService executor = Executors.newFixedThreadPool(10);
	private static CountDownLatch myLock = new CountDownLatch(5);

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			executor.execute(() -> {
				try {
					Thread.sleep(1);
					System.out.println(Thread.currentThread().getName() + "========" + System.nanoTime());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				myLock.countDown();
			});
		}

		Thread.sleep(10000);

		myLock.await();
		System.out.println("end");
		executor.shutdown();
	}
}
