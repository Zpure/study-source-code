package com.zcpure.souce.code.java.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ethan
 * @create_time 2019/5/27 17:44
 */
public class ReentrantLockDemo {
	private static ExecutorService executor = Executors.newFixedThreadPool(10);
	private static ReentrantLock myLock = new ReentrantLock(true);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			executor.execute(() -> {
				myLock.lock();
				try {
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName() + ":------------");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					myLock.unlock();
				}

			});
		}
		try {
			myLock.lock();
			executor.shutdown();
		} finally {
			myLock.unlock();
		}


	}
}
