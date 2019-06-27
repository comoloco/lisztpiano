package com.piano.liszt.dao;

import java.util.List;

import javax.annotation.Resource;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.piano.liszt.dto.Board2Dto;
import com.piano.liszt.dto.BoardDto;
import com.piano.liszt.dto.BoardFileDto;
import com.piano.liszt.form.Board2FileForm;
import com.piano.liszt.form.Board2Form;
import com.piano.liszt.form.BoardFileForm;
import com.piano.liszt.form.BoardForm;
 
@Repository
public class Board2Dao {
 
    @Resource(name = "sqlSession")
    private SqlSession sqlSession;
 
    private static final String NAMESPACE = "com.piano.liszt.board2Mapper";
 
    
    /** 게시판 - 목록 수 */
	public int getBoardCnt(Board2Form boardForm) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardCnt2", boardForm);
	}

	/** 게시판 - 목록 조회 */
	public List<Board2Dto> getBoardList(Board2Form boardForm) throws Exception {

		return sqlSession.selectList(NAMESPACE + ".getBoardList2", boardForm);
	}

	/** 게시판 - 조회 수 수정 */
	public int updateBoardHits(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoardHits2", boardForm);
	}

	/** 게시판 - 상세 조회 */
	public Board2Dto getBoardDetail(Board2Form boardForm) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardDetail2", boardForm);
	}

	/** 게시판 - 등록 */
	public int insertBoard(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoard2", boardForm);
	}

	/** 게시판 - 등록 실패(트랜잭션 테스트) */
	public int insertBoardFail(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoardFail2", boardForm);
	}

	/** 게시판 - 삭제 */
	public int deleteBoard(Board2Form boardForm) throws Exception {

		return sqlSession.delete(NAMESPACE + ".deleteBoard2", boardForm);
	}

	/** 게시판 - 수정 */
	public int updateBoard(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoard2", boardForm);
	}

	/** 게시판 - 답글 정보  조회 */
	public Board2Dto getBoardReplyInfo(Board2Form boardForm) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".getBoardReplyInfo2", boardForm);
	}
	
	/** 게시판 - 답글의 순서 수정 */
	public int updateBoardReSeq(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoardReSeq2", boardForm);
	}
	
	/** 게시판 - 답글 등록 */
	public int insertBoardReply(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoardReply2", boardForm);
	}

	/** 게시판 - 그룹 번호 조회 */
    public int getBoardReRef(Board2Form boardForm) throws Exception {
 
        return sqlSession.selectOne(NAMESPACE + ".getBoardReRef2", boardForm);
    }
	
	 /** 게시판 - 첨부파일 등록 */
	public int insertBoardFile(Board2FileForm boardFileForm) throws Exception {
        return sqlSession.insert(NAMESPACE + ".insertBoardFile2", boardFileForm);
    }
	
	/** 게시판 - 첨부파일 조회 */
	public List<BoardFileDto> getBoardFileList(Board2FileForm boardFileForm) throws Exception{
		
		return sqlSession.selectList(NAMESPACE + ".getBoardFileList2", boardFileForm);
	}

	/** 게시판 - 첨부파일 삭제 */
    public int deleteBoardFile(Board2FileForm deleteBoardFileForm) throws Exception {
        return sqlSession.update(NAMESPACE + ".deleteBoardFile2", deleteBoardFileForm);
    }
}