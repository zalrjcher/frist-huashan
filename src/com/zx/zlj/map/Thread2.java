package com.zx.zlj.map;

/**
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
 * 
 * @author lenovo
 *
 */
public class Thread2 {
	private static Thread thread1;
	private static Thread thread2;
	private static Thread thread3;
	private static Thread thread4;
	private static Boolean index = false;
	
	public static void main(String[] args) {
		A a = new A();
		for(int i = 0 ; i < 2 ; i++) {
			
			thread1=Thread2.creatThread1(a);
			thread3=Thread2.creatThread2(a);
			thread1.start();
			thread3.start();
			
			
		}
	}
	
	public static Thread creatThread1(A a) {
		
		return new Thread() {
			@Override
			public void run() {
				for(int i = 1 ; i <5 ; i++) {
					a.add();
				}
			}
		};
		
	}
	public static Thread creatThread2(A a) {
		return new Thread() {
			@Override
			public void run() {
				for(int j = 1 ; j < 5 ; j++) {
					a.delete();
				}
			}
		};
		
	}
}

class A {
	  static int  a = 100;
	  static int index = 1 ;
	  static int index2 = 1 ;
	public  void delete() {
		a--;
		System.out.println(a);
	
		
	}

	public  void add() {
		a++;
		System.out.println(a);
	
	}
}
