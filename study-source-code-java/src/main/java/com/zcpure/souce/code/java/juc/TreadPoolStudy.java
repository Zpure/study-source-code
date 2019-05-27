package com.zcpure.souce.code.java.juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ethan
 * @create_time 2019/5/22 15:04
 */
public class TreadPoolStudy {
	public static class MyLockRunnable implements Runnable {
		private ReentrantLock myLock = new ReentrantLock(true);

		@Override
		public void run() {
			myLock.lock();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				myLock.unlock();
			}

		}
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		MyLockRunnable myLockRunnable = new MyLockRunnable();
		executor.execute(myLockRunnable);

		executor.shutdown();

	}
}
