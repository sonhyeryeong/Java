package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/after")
public class AfterServlet extends HttpServlet {
	//사용자의 요청 흐름을 제어하기 위해서 필요하다!!

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();//쿠키를 req에서 받아온다. 
		Cookie loginCookie = null;//로그인쿠키 선언
		
		//로그인이 됐을 경우 -> 어떤 쿠키가 있음!
		if(cookies != null) {
			for(Cookie c:cookies) {
				if(c.getName().equals("loginok")) {
					loginCookie =c;
				}
			}
		}
		
		
		if(loginCookie != null) {//로그인 되었을 때 !
			req.getRequestDispatcher("/WEB-INF/testlogin.jsp").forward(req, resp);
		}else {
			//로그인 x ->사용자에게 로그인 하라고 안내를 해준다. 
			resp.sendRedirect("./idremember.jsp");
		}
			
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
