package com.piano.liszt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piano.liszt.user.controller.UserController;
import com.piano.liszt.user.service.UserService;

@Controller
public class LisztPianoController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private JavaMailSender mailSender;
	@Inject
	private UserService userService;
	/* 메인화면 */
	@RequestMapping(value = "/lisztMain")
	public String LisztMain(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "main/main";
	}
	
	/* 학원 소개 */
	@RequestMapping(value = "/aboutUs")
	public String AboutUs(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "aboutUs/aboutUs";
	}
	/* 원생관리 */
	@RequestMapping(value = "/manage")
	public String Manage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "manage/manage";
	}
	/* 커리큘럼 */
	@RequestMapping(value = "/curriculum")
	public String Curriculum(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "curriculum/curriculum";
	}
	/* 수강신청 */
	@RequestMapping(value = "/admission")
	public String Admission(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		return "admission/admission";
	}
	
	/* 문의상담 */
	@RequestMapping(value = "/councel")
	public String Councel(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "councel/councel";
	}
	// mailSending 코드
		@RequestMapping(value = "/mailSending.do")
		public String mailSending(HttpServletRequest request) {

			String setfrom = "funday5@naver.com";
			String tomail = "funday5@naver.com"; // 받는 사람 이메일
			String title = "상담요청"; // 제목
			
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String age = request.getParameter("age");
			String tel = request.getParameter("tel");
			String kind = request.getParameter("kind");
			String cont = request.getParameter("cont");
			
			String conten = "이름 : "+name+"성별 : "+gender+"나이 : "+age+"전화번호 : "+tel +"모집분야 : "+kind + "상담내용 : "+cont;
			
			String content = conten; // 내용
			try {
				MimeMessage message = mailSender.createMimeMessage();
				MimeMessageHelper messageHelper = new MimeMessageHelper(message,
						true, "UTF-8");

				messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
				messageHelper.setTo(tomail); // 받는사람 이메일
				messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
				messageHelper.setText(content); // 메일 내용

				mailSender.send(message);
			} catch (Exception e) {
				System.out.println(e);
			}

			return "councel/councel";
		}
	
	
	/* 자료실 */
	@RequestMapping(value = "/archive")
	public String Archive(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "archive/archive";
	}
	
}