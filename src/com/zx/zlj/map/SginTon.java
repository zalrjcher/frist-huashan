package com.zx.zlj.map;

public class SginTon {
	
	private SginTon(){}
	private static class Inner{
		
		private static final SginTon sginTon =  new SginTon();
	}	
	public static SginTon getSginTon() {
		return Inner.sginTon;
	}
}
