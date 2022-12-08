package org.practice;

import java.util.Scanner;

public class B {
	public static void main(String ar[]) {

		MyThread mthread = new MyThread();

		mthread.start();

		}

		}

		class ThreadDemo implements Runnable {

		public void run() {

		System.out.println("Thread Demo");

		}

		}

		class MyThread extends Thread {

		public void start(){

		System.out.println("My Thread");

		}

		public void run() {

		Thread thrd = new Thread(new ThreadDemo());

		thrd.start();

		}
		
}