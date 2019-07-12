package com.myframework.map.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.controller.Controller;
import com.myframework.map.model.repository.MapsDAO;

public class ListController implements Controller{
	MapsDAO mapsDAO=new MapsDAO();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List mapsList = mapsDAO.selectAll(); //3단계
		request.setAttribute("mapsList", mapsList);//4단계
	}
	
	public String getResultKey() {
		return "/view/map/list";
	}
	
	public boolean isForward() {
		return true;
	}
}



