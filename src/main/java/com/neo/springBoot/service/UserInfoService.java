package com.neo.springBoot.service;

import com.neo.springBoot.model.UserInfo;

public interface UserInfoService {
	
	public UserInfo findByUsername(String username);
}
