package com.zx.zlj.map;


/**
 * ���߳�ѭ��10�Σ��������߳�ѭ��100�������ֻص����߳�ѭ��10�Σ�
 * �����ٻص����߳���ѭ��100�����ѭ��50�Σ���д������
 * @author lenovo
 *
 */
public class Thread3 {
	
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+"ѭ��:"+i);
		}
		
	}
	public void creatThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 50 ;i++) {
					for(int j = 0 ; j < 10 ; j++) {
						System.out.println(Thread.currentThread().getName()+i+"��ѭ��:"+i);
					}
				}
				
			}
		});
	}
	
}
