package com.snail.charity.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.snail.charity.dao.IUserDao;

@Repository
public class IUserDaoImpl extends BaseDao implements IUserDao {

	public void queryAllUser() {
		Query query = getCurrentSession().createQuery("from TUser");
		List<?> list = query.list();
		System.out.println("list count="+list.size());
	}

}
