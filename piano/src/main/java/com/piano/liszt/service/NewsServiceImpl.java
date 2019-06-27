package com.piano.liszt.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.piano.liszt.common.LoggerInterceptor;
import com.piano.liszt.common.util.FileUtils;
import com.piano.liszt.dao.NewsDAO;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
	protected final Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);

	
	
	/*
	 * @Autowired(required="fileUtils") private FileUtils fileUtils;
	 */
	@Resource(name = "newsDAO")
	private NewsDAO newsDAO;

	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return newsDAO.selectBoardList(map);
	}

	@Override
	public void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception {
		newsDAO.insertBoard(map);
		
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
	    Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
	    MultipartFile multipartFile = null;
	    while(iterator.hasNext()){
	        multipartFile = multipartHttpServletRequest.getFile(iterator.next());
	        if(multipartFile.isEmpty() == false){
	            log.debug("------------- file start -------------");
	            log.debug("name : "+multipartFile.getName());
	            log.debug("filename : "+multipartFile.getOriginalFilename());
	            log.debug("size : "+multipartFile.getSize());
	            log.debug("-------------- file end --------------\n");
	        }
	    }
	}

	@Override
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception {

		newsDAO.updateHitCnt(map);
		Map<String, Object> resultMap = newsDAO.selectBoardDetail(map);
		return resultMap;
	}

	@Override
	public void updateBoard(Map<String, Object> map) throws Exception {
		newsDAO.updateBoard(map);

	}

	@Override
	public void deleteBoard(Map<String, Object> map) throws Exception {
		newsDAO.deleteBoard(map);

	}

}
