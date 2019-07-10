package com.myframework.board.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.myframework.board.model.domain.Board2;

import mybatis.config.MybatisConfigManager;

public class Board2DAO {
	MybatisConfigManager configManager=MybatisConfigManager.getInstance();
	
	public int insert(Board2 board2) {
		int result=0;
		SqlSession sqlSession = configManager.getSqlSession(); 
		sqlSession.insert("Board2.insert", board2);
		sqlSession.commit();
		configManager.freeSession(sqlSession);
		return result;
	}
	
}



