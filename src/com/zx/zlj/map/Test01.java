package com.zx.zlj.map;

public class Test01 {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserDao(new UserDaoImpl());
		userServiceImpl.add();
	}
}
