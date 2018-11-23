package com.neo.springBoot.dao;

import org.springframework.data.repository.CrudRepository;

import com.neo.springBoot.model.UserInfo;

public interface UserInfoDao extends CrudRepository<UserInfo, Long>{

	public UserInfo findByUsername(String username);
}
