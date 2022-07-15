package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleCounterServlet
 */
@WebServlet("/lifecycle_image_counter.do")
public class LifeCycleCounterImageServlet extends HttpServlet {

	
	private int count=0;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*
		 * 응답객체(헤더)에 contentType설정
		 */
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * 클라이언트로 전송할 스트림객체생성
		 */
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body bgcolor=#40e0d0 style=\"font-size: 9pt; line-height: 140%;\">");
		out.println("	<center>");
		out.println("		현재까지의 페이지뷰수 <font color=#0000FF> " + ++count + " </font> 번입니다");
		out.println("<br>");
		out.println("현재까지의 페이지뷰수");
		
		
		List<Integer>  intList = new ArrayList<Integer>();
		int imageCount = count;
		while(imageCount>0) {
			intList.add(imageCount%10);
			imageCount/=10;
		}
		for(int i = intList.size()-1;i>=0;i--) {
			out.println("<img src='images/"+intList.get(i)+".png'>");
		}
		
		out.println(" 번입니다");	
		out.println("	</center>");
		out.println("</body>");
		out.println("</html>");
	}
}