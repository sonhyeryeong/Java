package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editcookie")
public class EditCookieServlet extends HttpServlet {
	//쿠키- 기간이 만료되었을 때 삭제된다. 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c = new Cookie("yourname","edit");
		resp.addCookie(c);
		
		Cookie c2 = new Cookie("korname","");
		c2.setMaxAge(0);//초 단위로 쿠키의 만료시간을 정해줄 수 있다. 
		
		resp.addCookie(c2);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
