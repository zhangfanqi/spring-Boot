package com.neo.springBoot.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neo.springBoot.dao.UserInfoDao;
import com.neo.springBoot.model.UserInfo;
import com.neo.springBoot.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoDao userInfoDao;
	@Override
	public UserInfo findByUsername(String username) {
		
		return userInfoDao.findByUsername(username);
	}

}
