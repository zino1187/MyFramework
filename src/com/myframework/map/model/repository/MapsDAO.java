package com.myframework.map.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myframework.map.model.domain.Maps;

import mybatis.config.MybatisConfigManager;

public class MapsDAO {
	MybatisConfigManager configManager = MybatisConfigManager.getInstance();
	
	//µî·Ï~~!!
	public int insert(Maps maps) {
		int result=0;
		SqlSession sqlSession = configManager.getSqlSession();
		result=sqlSession.insert("Maps.insert", maps);
		sqlSession.commit();
		configManager.freeSession(sqlSession);
		return result;
	}
	public List selectAll() {
		List list = null;
		SqlSession sqlSession = configManager.getSqlSession();
		list=sqlSession.selectList("Maps.selectAll");
		configManager.freeSession(sqlSession);
		return list;
	}
	
}
















		