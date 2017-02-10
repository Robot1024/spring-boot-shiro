package com.kfit.service.impl;

import javax.annotation.Resource;

import com.kfit.domain.UserInfo;
import com.kfit.repository.UserInfoRepository;
import com.kfit.service.UserInfoService;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}
	
}
