package kr.co.greenart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CountryServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청 주소에 요청 흐름 제어 
		String continent = req.getParameter("continent");
		CountryDAO dao= new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent("Asia");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("result.jsp").forward(req,resp);
		
		//논리적인 흐름을 제어하는 코드들을 서블릿이라는 곳에 위치시킬 수 있다. !!!
		
		
		
		
		
		
		
//		PrintWriter pw = resp.getWriter();
//		pw.println("<!DOCTYPE html>");
//		pw.println("<html>");
//		pw.println("<head><meta charset='utf-8'/></head>");
//		pw.println("<body><h1>hello servlet</h1></body>");
//		pw.flush();
		
//		언제 동작하냐? 특정한 주소에 대해서 서블릿이 요청할 때  
		
		
	}
	
}
