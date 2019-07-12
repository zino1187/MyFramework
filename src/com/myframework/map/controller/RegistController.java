package com.myframework.map.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.controller.Controller;
import com.myframework.map.model.domain.Maps;
import com.myframework.map.model.repository.MapsDAO;

//3단계: 로직객체에 일 시키기!! 
//4단계: jsp인 뷰에 가져갈것이 있다면 저장 (선택사항)  select~~
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
		System.out.println("등록 결과는 "+result);		
	}

	public String getResultKey() {
		return "/view/map/regist";
	}
	public boolean isForward() {
		return false;
	}
	
}
