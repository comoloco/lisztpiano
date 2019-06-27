package com.piano.liszt.user.service;

import java.util.List;
import java.util.Map;

import com.piano.liszt.user.model.UserVO;

public interface UserService {
	public List<UserVO> getUserList() throws Exception;

	public UserVO getUserInfo(String uid) throws Exception;

	public void insertUser(UserVO userVO) throws Exception;

	public void updateUser(UserVO userVO) throws Exception;

	public void deleteUser(String uid) throws Exception;

	public Map<String, Object> selectUserInfo(Map<String, Object> map) throws Exception;

}
