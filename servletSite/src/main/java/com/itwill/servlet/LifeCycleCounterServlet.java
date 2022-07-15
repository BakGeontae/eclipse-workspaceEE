package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleCounterServlet
 */
@WebServlet({ "/LifeCycleCounterServlet", "/lifecycle_counter.do" })
//간편하게 매핑
public class LifeCycleCounterServlet extends HttpServlet {
	public LifeCycleCounterServlet() {
		System.out.println("0.LifeCycleCounterServlet() 기본생성자호출[최초요청시 단한번 객체 생성] 객체주소-->"+this);
	}
	
	@Override
		public void init() throws ServletException {
			super.init();
			System.out.println("1.init()메소드--> 생성자호출직후에 단한번호출[객체초기화,리소스획득]");
		}
	private int count=0;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2.service메소드 실행");
		/*
		 * 응답객체에 contentType설정
		 */
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * 클라이언트로 전송할 스트림객체 생성
		 */
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body bgcolor=#40e0d0 style=\"font-size: 9pt; line-height: 140%;\">");
		out.println("	<center>");
		out.println("		현재까지의 페이지뷰수 <font color=#0000FF> "+ ++count + "</font> 번입니다");
		out.println("	</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
