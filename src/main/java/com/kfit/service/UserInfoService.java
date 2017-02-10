package com.kfit.service;


import com.kfit.domain.UserInfo;

public interface UserInfoService {
	
	/**通过username查找用户信息;*/
	public UserInfo findByUsername(String username);
	
}
