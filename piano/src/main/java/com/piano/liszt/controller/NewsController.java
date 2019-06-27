package com.piano.liszt.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.piano.liszt.common.common.CommandMap;
import com.piano.liszt.service.NewsService;

@Controller
public class NewsController {

	
	@Resource(name="newsService")
	private NewsService newsService;
	
	@RequestMapping(value="/news")
	public ModelAndView newsList(Map<String,Object> commandMap) throws Exception{

		
		List<Map<String,Object>> list = newsService.selectBoardList(commandMap);
		ModelAndView mv = new ModelAndView("/news/boardList");
		mv.addObject("list", list);
		
		return mv;
		
	}
	@RequestMapping(value="/news/newsWrite")
	public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("/news/boardWrite");
	    return mv;
	}

	
	@RequestMapping(value="/news/insertNews") public ModelAndView
	insertBoard(CommandMap commandMap, HttpServletRequest request) throws
	Exception{ newsService.insertBoard(commandMap.getMap(),request);
	  
	ModelAndView mv = new ModelAndView("redirect:/news"); return mv; }
 
	@RequestMapping(value="/news/newsDetail")
	public ModelAndView openBoardDetail(CommandMap commandMap) throws Exception{
	    Map<String,Object> map = newsService.selectBoardDetail(commandMap.getMap());
	 
	    ModelAndView mv = new ModelAndView("/news/boardDetail");
	    mv.addObject("map", map);
	 
	    return mv;
	}
	@RequestMapping(value="/news/newsUpdate")
	public ModelAndView openBoardUpdate(CommandMap commandMap) throws Exception{
	    Map<String,Object> map = newsService.selectBoardDetail(commandMap.getMap());
	 
	    ModelAndView mv = new ModelAndView("/news/boardUpdate");
	    mv.addObject("map", map);
	 
	    return mv;
	}
	 
	@RequestMapping(value="/news/updateNews")
	public ModelAndView updateBoard(CommandMap commandMap) throws Exception{
	    newsService.updateBoard(commandMap.getMap());
	    
	    ModelAndView mv = new ModelAndView("redirect:/news/newsDetail");
	    mv.addObject("IDX", commandMap.get("IDX"));
	 
	    return mv;
	}

	@RequestMapping(value="/news/deleteNews")
	public ModelAndView deleteBoard(CommandMap commandMap) throws Exception{
	    newsService.deleteBoard(commandMap.getMap());
	 
	    ModelAndView mv = new ModelAndView("redirect:/news");
	    return mv;
	}

}
