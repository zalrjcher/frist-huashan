package com.zx.zlj.map;

import java.util.Arrays;

public class Thread_  {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new Thread_().add2();
		Thread_.add();
	}
	public   static void   add() {
		
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		},"111").start() ;
	}
	public void add2() {
		System.out.println(Arrays.toString(this.getClass().getDeclaredMethods()));
	}
}
