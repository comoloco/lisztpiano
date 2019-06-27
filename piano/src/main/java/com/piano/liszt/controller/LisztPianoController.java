package com.piano.liszt.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LisztPianoController {

	@Autowired
	private JavaMailSender mailSender;
	
	/* ����ȭ�� */
	@RequestMapping(value = "/lisztMain")
	public String LisztMain(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "main/main";
	}
	
	/* �п� �Ұ� */
	@RequestMapping(value = "/aboutUs")
	public String AboutUs(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "aboutUs/aboutUs";
	}
	/* �������� */
	@RequestMapping(value = "/manage")
	public String Manage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "manage/manage";
	}
	/* Ŀ��ŧ�� */
	@RequestMapping(value = "/curriculum")
	public String Curriculum(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "curriculum/curriculum";
	}
	/* ������û */
	@RequestMapping(value = "/admission")
	public String Admission(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "admission/admission";
	}
	
	/* ���ǻ�� */
	@RequestMapping(value = "/councel")
	public String Councel(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "councel/councel";
	}
	// mailSending �ڵ�
		@RequestMapping(value = "/mailSending.do")
		public String mailSending(HttpServletRequest request) {

			String setfrom = "funday5@naver.com";
			String tomail = "funday5@naver.com"; // �޴� ��� �̸���
			String title = "����û"; // ����
			
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String age = request.getParameter("age");
			String tel = request.getParameter("tel");
			String kind = request.getParameter("kind");
			String cont = request.getParameter("cont");
			
			String conten = "�̸� : "+name+"���� : "+gender+"���� : "+age+"��ȭ��ȣ : "+tel +"�����о� : "+kind + "��㳻�� : "+cont;
			
			String content = conten; // ����
			try {
				MimeMessage message = mailSender.createMimeMessage();
				MimeMessageHelper messageHelper = new MimeMessageHelper(message,
						true, "UTF-8");

				messageHelper.setFrom(setfrom); // �����»�� �����ϸ� �����۵��� ����
				messageHelper.setTo(tomail); // �޴»�� �̸���
				messageHelper.setSubject(title); // ���������� ������ �����ϴ�
				messageHelper.setText(content); // ���� ����

				mailSender.send(message);
			} catch (Exception e) {
				System.out.println(e);
			}

			return "councel/councel";
		}
	
	
	/* �ڷ�� */
	@RequestMapping(value = "/archive")
	public String Archive(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "archive/archive";
	}
	
}