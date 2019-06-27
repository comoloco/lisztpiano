package com.piano.liszt.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface NewsService {

	List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap) throws Exception;

	void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

	void updateBoard(Map<String, Object> map) throws Exception;

	void deleteBoard(Map<String, Object> map) throws Exception;

}
