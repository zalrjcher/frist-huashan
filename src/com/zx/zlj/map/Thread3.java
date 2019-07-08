package com.zx.zlj.map;


/**
 * 子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，
 * 接着再回到主线程又循环100，如此循环50次，请写出程序。
 * @author lenovo
 *
 */
public class Thread3 {
	
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+"循环:"+i);
		}
		
	}
	public void creatThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 50 ;i++) {
					for(int j = 0 ; j < 10 ; j++) {
						System.out.println(Thread.currentThread().getName()+i+"：循环:"+i);
					}
				}
				
			}
		});
	}
	
}
