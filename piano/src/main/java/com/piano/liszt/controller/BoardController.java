package com.piano.liszt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.piano.liszt.common.ResultUtil;
import com.piano.liszt.dto.BoardDto;
import com.piano.liszt.form.BoardForm;
import com.piano.liszt.service.BoardService;
import com.piano.liszt.user.controller.UserController;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private BoardService boardService;

	/* 게시판 - 목록 페이지 이동 */
	@RequestMapping(value = "/boardList")
	public String getBoardList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardList";
	}

	/* 게시판 - 목록 조회 */
	@RequestMapping(value = "/getBoardList")
	@ResponseBody
	public ResultUtil getBoardList(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		ResultUtil resultUtils = boardService.getBoardList(boardForm);

		return resultUtils;
	}

	/* 게시판 - 상세 페이지 이동 */
	@RequestMapping(value = "/boardDetail")
	public String boardDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardDetail";
	}

	/* 게시판 - 상페 조회 */
	@RequestMapping(value = "/getBoardDetail")
	@ResponseBody
	public BoardDto getBoardDetail(Model model, HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.getBoardDetail(boardForm);
		model.addAttribute("board_writer",boardDto.getBoard_writer());
		logger.info("board_writer123414214"+boardDto.getBoard_writer());
		return boardDto;
	}

	/* 게시판 - 작성 페이지 이동 */
	@RequestMapping(value = "/boardWrite")
	public String boardWrite(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardWrite";
	}

	/* 게시판 -등록 */
	@RequestMapping(value = "/insertBoard")
	@ResponseBody
	public BoardDto insertBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.insertBoard(boardForm);

		return boardDto;
	}

	/* 게시판 - 삭제 */
	@RequestMapping(value = "/deleteBoard")
	@ResponseBody
	public BoardDto deleteBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.deleteBoard(boardForm);

		return boardDto;
	}

	/* 게시판 - 수정 페이지 이동 */
	@RequestMapping(value = "/boardUpdate")
	public String boardUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardUpdate";

	}
	
	/* 게시판 - 수정 */
	@RequestMapping(value="/updateBoard")
	@ResponseBody
	public BoardDto updateBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {
		
		BoardDto boardDto = boardService.updateBoard(boardForm);
		
		return boardDto;
	
	}
	
	/* 게시판 - 답글 페이지 이동 */
	@RequestMapping(value = "/boardReply")
	public String boardReply(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardReply";
	}

	/* 게시판 - 답글 등록 */
	@RequestMapping(value = "/insertBoardReply")
	@ResponseBody
	public BoardDto insertBoardReply(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm) throws Exception {

		BoardDto boardDto = boardService.insertBoardReply(boardForm);

		return boardDto;
	}
	
	  /* 게시판 - 첨부파일 다운로드 */
    @RequestMapping("/fileDownload")                      
    public ModelAndView fileDownload(@RequestParam("fileNameKey") String fileNameKey
                                    ,@RequestParam("fileName") String fileName
                                    ,@RequestParam("filePath") String filePath) throws Exception {
          
        /* 첨부파일 정보 조회 */
        Map<String, Object> fileInfo = new HashMap<String, Object>();
        fileInfo.put("fileNameKey", fileNameKey);
        fileInfo.put("fileName", fileName);
        fileInfo.put("filePath", filePath);
     
        return new ModelAndView("fileDownloadUtil", "fileInfo", fileInfo);
    }

}