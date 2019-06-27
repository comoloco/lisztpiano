package com.piano.liszt.user.controller;

import java.util.Map;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.piano.liszt.common.common.CommandMap;
import com.piano.liszt.user.model.UserVO;
import com.piano.liszt.user.service.UserService;;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Inject
	private UserService userService;

	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public String getUserList(Model model) throws Exception {
		logger.info("getUserList()....");
		model.addAttribute("userList", userService.getUserList());
		return "user/userList";
	}
	@RequestMapping(value = "/manageUser", method = RequestMethod.GET)
	public String manageUser(Model model) throws Exception {
		logger.info("getUserList()....");
		model.addAttribute("userList", userService.getUserList());
		return "user/manageUser";
	}

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute("userVO") UserVO userVO, RedirectAttributes rttr) throws Exception {
		userService.insertUser(userVO);
		return "redirect:/user/getUserList";
	}
	
	@RequestMapping(value="/openLogin")
	public ModelAndView openLogin(HttpServletRequest request, HttpServletResponse response, CommandMap commandMap) throws Exception{
		ModelAndView mav= new ModelAndView();
		
		if(request.getSession().getAttribute("loginInfo")!=null) {
			String msg="�̹� �α��ε� �����Դϴ�.";
			mav.addObject("msg",msg);
			mav.setViewName("/login/loginSuccess");
		}else {
			mav.setViewName("/login/login");
		}
		return mav;
	}
	
	@RequestMapping(value="/loginTry")
	public ModelAndView login(HttpServletRequest request, CommandMap commandMap) throws Exception{
		ModelAndView mav= new ModelAndView("/login/loginSuccess");
		Map<String, Object> map = userService.selectUserInfo(commandMap.getMap());
		
		if(map==null) {
			mav.addObject("msg","�α��ο� �����Ͽ����ϴ�.");
		}else {
			request.getSession().setAttribute("loginInfo", map);
			request.getSession().setMaxInactiveInterval(60*30);
			mav.addObject("msg","�α��ο� �����Ͽ����ϴ�.");
		}
		return mav;
	}
	@RequestMapping(value="/logoutTry")
	public ModelAndView logout(HttpServletRequest request) throws Exception{
		request.getSession().removeAttribute("loginInfo");
		ModelAndView mav= new ModelAndView("/login/logout");
		mav.addObject("msg","�α׾ƿ��Ǿ����ϴ�.");
		
		return mav;
	}
	@RequestMapping(value="/needLogin")
	public ModelAndView needLogin() throws Exception{
		ModelAndView mav = new ModelAndView("/user/loginWarning");
		mav.addObject("msg","�α��� �� �̿����ֽñ� �ٶ��ϴ�.");
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/idCheck",method=RequestMethod.POST)
	public int PostIdCheck(HttpServletRequest req) throws Exception{
		
		String userId=req.getParameter("uid");
		UserVO idCheck =userService.getUserInfo(userId);
		int result =0;
		if(idCheck != null) {
			result=1;
		}
		return result;
	}
	@RequestMapping(value = "/findIDPW")
	public String findidpwd(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "login/findIDPW";
	}
}
