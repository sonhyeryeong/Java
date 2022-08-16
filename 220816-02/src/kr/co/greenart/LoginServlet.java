package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservice")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		 
		if(password != null  && password.equals("qwer")) {//로그인 성공하면
			HttpSession session = request.getSession();
			session.setAttribute("loginid", id);//로그인을 했다는 것을 판별하기 위해서 세션에 값을 담는다.(아이디 값을 담았음)
			
		}
		
		request.getRequestDispatcher("./loginresult.jsp").forward(request, response);
	}

}
