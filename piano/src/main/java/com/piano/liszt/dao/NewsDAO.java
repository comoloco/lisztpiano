package com.piano.liszt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("newsDAO")
public class NewsDAO extends AbstractDAO {
	
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return (List<Map<String,Object>>)selectList("news.selectBoardList",map);
	}

	public void insertBoard(Map<String, Object> map) {
		insert("news.insertBoard",map);
	}

	public void updateHitCnt(Map<String, Object> map) {
		update("news.updateHitCnt",map);
		
	}
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectBoardDetail(Map<String,Object> map) throws Exception{
		return (Map<String,Object>) selectOne("news.selectBoardDetail", map);
	}

	public void updateBoard(Map<String, Object> map) throws Exception {
		update("news.updateBoard",map);
		
	}

	public void deleteBoard(Map<String, Object> map) throws Exception {
		update("news.deleteBoard",map);
		
	}

	public void insertFile(Map<String, Object> map) throws Exception {
		insert("news.insertFile",map);
		
	}

}
