package com.myframework.map.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.controller.Controller;
import com.myframework.map.model.domain.Maps;
import com.myframework.map.model.repository.MapsDAO;

//3�ܰ�: ������ü�� �� ��Ű��!! 
//4�ܰ�: jsp�� �信 ���������� �ִٸ� ���� (���û���)  select~~
public class RegistController implements Controller{
	MapsDAO mapsDAO=new MapsDAO();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String lati = request.getParameter("lati");
		String longi = request.getParameter("longi");
		String url = request.getParameter("url");
		String msg = request.getParameter("msg");
		
		Maps maps = new Maps();
		maps.setLati(Double.parseDouble(lati));
		maps.setLongi(Double.parseDouble(longi));
		maps.setUrl(url);
		maps.setMsg(msg);
		
		int result = mapsDAO.insert(maps);
		System.out.println("��� ����� "+result);		
	}

	public String getResultKey() {
		return "/view/map/regist";
	}
	public boolean isForward() {
		return false;
	}
	
}