<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	response.setContentType("text/html;charset=UTF-8");
	/*
	 * 1.파라메타바끼
	  	아이디:<input type="text" name="id">
		패에쓰:<input type="password" name="pass">
	 */
	 String id = request.getParameter("id");
	 String pass = request.getParameter("password");
	
	/*
	 * 2.업무실행(DB)
	 *  id |pass
	 *  ---------
	 *  xxx|1111
	 *  yyy|2222
	 */
	 boolean isMember1 = id.equals("xxx")&& pass.equals("1111");
	 boolean isMember2 = id.equals("xxx")&& pass.equals("1111");
	
	
	/*
	 * 3.클라이언트로 결과전송
	 */
	out.println("<h1>GET로그인결과</h1><hr/>");
	if(isMember1 || isMember2){
		//로그인실패
		out.println("<h3>"+id+"님 로그인실패<h3>");
		out.println("<a href='4.login_get_form.jsp'>다시로그인</a>");
		return;
	}
	//로그인 성공
	out.println("<h3>"+id+" 님 로그인성공</h3>");
	
	
%>    
