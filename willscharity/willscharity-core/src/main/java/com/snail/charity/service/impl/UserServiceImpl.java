package com.snail.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snail.charity.dao.IUserDao;
import com.snail.charity.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public void queryAllUser() {
		// TODO Auto-generated method stub
		userDao.queryAllUser();
	}

}
