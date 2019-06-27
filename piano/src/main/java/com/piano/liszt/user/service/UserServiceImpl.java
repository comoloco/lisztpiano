package com.piano.liszt.user.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.piano.liszt.user.dao.UserDAO;
import com.piano.liszt.user.model.UserVO;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Inject
	private UserDAO userDAO;

	@Override
	public List<UserVO> getUserList() throws Exception {
		return userDAO.getUserList();
	}

	@Override
	public UserVO getUserInfo(String uid) throws Exception {
		return userDAO.getUserInfo(uid);
	}

	@Override
	public void insertUser(UserVO userVO) throws Exception {
		userDAO.insertUser(userVO);
	}

	@Override
	public void updateUser(UserVO userVO) throws Exception {
		userDAO.updateUser(userVO);
	}

	@Override
	public void deleteUser(String uid) throws Exception {
		userDAO.deleteUser(uid);
	}

	@Override
	public Map<String, Object> selectUserInfo(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.selectUserInfo(map);
	}
}
