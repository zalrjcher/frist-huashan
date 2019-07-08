package com.zx.zlj.map;

public class Try {
	static int a = 1 ;
	public static void main(String[] args) {
		System.out.println(add());
	}
	
	public static  int add() {
		try {
			return ++ a ;
		} catch (Exception e) {
			return ++ a ;
		}finally {
			return ++ a ;
		}
	}
}	
