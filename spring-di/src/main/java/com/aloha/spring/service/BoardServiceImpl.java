package com.aloha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aloha.spring.dao.BoardDAO;
import com.aloha.spring.dto.Board;

public class BoardServiceImpl implements BoardService {
	
	// BoardServiceImpl --> BoardDAO 에 의존
	private BoardDAO boardDAO;
	
	// 의존성 자동 주입
	// - BoardDAO 빈을 참조하다면, 
	//   <bean><constructor-arg ref="boardDAO" /></bean>
	@Autowired
	public BoardServiceImpl(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
//	@Autowired
//	public BoardServiceImpl(int test) {
//		this.test = test;
//	}

	@Override
	public List<Board> list() {
		return boardDAO.list();
	}
	
	

}
