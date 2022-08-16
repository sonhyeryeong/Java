package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("사용자가 GET방식의 요청을 하였습니다.(게시판 목록)");
		
		System.out.println("세션 값을 확인합니다.");
		HttpSession session = req.getSession();
		Object loginid = session.getAttribute("loginid");
		
		//로그인 했는지 확인하는 절차를 거친다. 
		if(loginid !=null) {
			System.out.println("로그인 확인되었습니다. 게시판 목록으로 forward합니다.");
			List<String> articles = new ArrayList<>(Arrays.asList("글1","글2","글3"));
			req.setAttribute("articles", articles);
			
			req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
		}else {
			System.out.println("로그인 하지 않은 유저");
			
//			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//setStatus는 에러 코드만 보여주고 에러 페이지로 이동하지 않는다.!!!
//			req.getRequestDispatcher("needlogin.jsp").forward(req, resp);
			
			//에러페이지로 보내주는 메소드 
			resp.sendError(HttpServletResponse.SC_UNAUTHORIZED);//응답코드 401번임.-인증이 되어 있지 않았을 때 보여주는 코드 
		}
		
	}

}
