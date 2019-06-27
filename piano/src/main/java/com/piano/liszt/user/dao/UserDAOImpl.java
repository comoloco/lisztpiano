package com.piano.liszt.user.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.piano.liszt.user.model.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<UserVO> getUserList() throws Exception {
		return sqlSession.selectList("com.piano.liszt.userMapper.getUserList");
	}

	@Override
	public UserVO getUserInfo(String uid) throws Exception {
		return sqlSession.selectOne("com.piano.liszt.userMapper.getUserInfo", uid);
	}

	@Override
	public int insertUser(UserVO userVO) throws Exception {
		return sqlSession.insert("com.piano.liszt.userMapper.insertUser", userVO);
	}

	@Override
	public int updateUser(UserVO userVO) throws Exception {
		return sqlSession.update("com.piano.liszt.userMapper.updateUser", userVO);
	}

	@Override
	public int deleteUser(String uid) throws Exception {
		return sqlSession.delete("com.piano.liszt.userMapper.deleteUser", uid);
	}

	@Override
	public Map<String, Object> selectUserInfo(Map<String, Object> map) throws Exception {
		
		return sqlSession.selectOne("com.piano.liszt.userMapper.selectUserInfo", map);
	}
}
