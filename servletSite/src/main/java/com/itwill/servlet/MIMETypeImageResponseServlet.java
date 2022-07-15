package com.itwill.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MIMETypeImageResponseServlet
 */
@WebServlet({ "/MIMETypeImageResponseServlet", "/response_image.do" })
public class MIMETypeImageResponseServlet extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. 응답객체 MIME타입 설정
		 */
		response.setContentType("image/jpeg");
		/*
		 * 2. 브라우저와 연결된 출력스트림 생성
		 */
		OutputStream out = response.getOutputStream();
		/*
		 * servletSite context의 실제경로 
		 */
		ServletContext servletContext = this.getServletContext();
		String contextRealPath = servletContext.getRealPath("images/album.jpg");
		
		
		FileInputStream fis = new FileInputStream("");
		
		
	
	
	}

}
