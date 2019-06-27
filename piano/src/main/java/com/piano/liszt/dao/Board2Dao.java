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
 
    
    /** �Խ��� - ��� �� */
	public int getBoardCnt(Board2Form boardForm) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardCnt2", boardForm);
	}

	/** �Խ��� - ��� ��ȸ */
	public List<Board2Dto> getBoardList(Board2Form boardForm) throws Exception {

		return sqlSession.selectList(NAMESPACE + ".getBoardList2", boardForm);
	}

	/** �Խ��� - ��ȸ �� ���� */
	public int updateBoardHits(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoardHits2", boardForm);
	}

	/** �Խ��� - �� ��ȸ */
	public Board2Dto getBoardDetail(Board2Form boardForm) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardDetail2", boardForm);
	}

	/** �Խ��� - ��� */
	public int insertBoard(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoard2", boardForm);
	}

	/** �Խ��� - ��� ����(Ʈ����� �׽�Ʈ) */
	public int insertBoardFail(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoardFail2", boardForm);
	}

	/** �Խ��� - ���� */
	public int deleteBoard(Board2Form boardForm) throws Exception {

		return sqlSession.delete(NAMESPACE + ".deleteBoard2", boardForm);
	}

	/** �Խ��� - ���� */
	public int updateBoard(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoard2", boardForm);
	}

	/** �Խ��� - ��� ����  ��ȸ */
	public Board2Dto getBoardReplyInfo(Board2Form boardForm) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".getBoardReplyInfo2", boardForm);
	}
	
	/** �Խ��� - ����� ���� ���� */
	public int updateBoardReSeq(Board2Form boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoardReSeq2", boardForm);
	}
	
	/** �Խ��� - ��� ��� */
	public int insertBoardReply(Board2Form boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoardReply2", boardForm);
	}

	/** �Խ��� - �׷� ��ȣ ��ȸ */
    public int getBoardReRef(Board2Form boardForm) throws Exception {
 
        return sqlSession.selectOne(NAMESPACE + ".getBoardReRef2", boardForm);
    }
	
	 /** �Խ��� - ÷������ ��� */
	public int insertBoardFile(Board2FileForm boardFileForm) throws Exception {
        return sqlSession.insert(NAMESPACE + ".insertBoardFile2", boardFileForm);
    }
	
	/** �Խ��� - ÷������ ��ȸ */
	public List<BoardFileDto> getBoardFileList(Board2FileForm boardFileForm) throws Exception{
		
		return sqlSession.selectList(NAMESPACE + ".getBoardFileList2", boardFileForm);
	}

	/** �Խ��� - ÷������ ���� */
    public int deleteBoardFile(Board2FileForm deleteBoardFileForm) throws Exception {
        return sqlSession.update(NAMESPACE + ".deleteBoardFile2", deleteBoardFileForm);
    }
}