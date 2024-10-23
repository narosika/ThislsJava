package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodC() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": metC 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodD() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methD 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodE() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methadE 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodF() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": meF 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": meB 실행");
		System.out.println();
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
