package com.example.board2.service;

import java.util.List;

import com.example.board2.dto.Board;

public interface BoardService {
	public int maxNum() throws Exception;
	public void insertData(Board board) throws Exception; // dao에 있는 추상메소드 넣어주면 됨
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	public List<Board> getLists(String searchKey, String searchValue, int start, int end) throws Exception;
	public void updateHitCount(int num) throws Exception;
	public Board getReadData (int num) throws Exception;
	public void updateData(Board board) throws Exception;
	public void deleteData(int num) throws Exception;
}
