package com.zx.zlj.map;

public class UserServiceImpl {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add() {
		userDao.add();
	}
}
