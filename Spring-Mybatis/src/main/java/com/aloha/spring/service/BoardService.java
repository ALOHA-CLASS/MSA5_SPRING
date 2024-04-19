package com.aloha.spring.service;


import java.util.List;

import com.aloha.spring.dto.Board;

public interface BoardService {

	// 게시글 목록
	public List<Board> list() throws Exception;
	
	// 게시글 조회
	public Board select(int no) throws Exception;
	
	// 게시글 등록
	public Integer insert(Board board) throws Exception;
	
	// 게시글 수정
	public Integer update(Board board) throws Exception;
	
	// 게시글 삭제
	public Integer delete(int no) throws Exception;
}




