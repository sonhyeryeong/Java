package hello;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int some =10;
	
	
	public HelloServlet() {
		super();
		System.out.println("헬로 서블릿 생성자는 언제 호출될까요?");
		//서블릿을 요청했을 때 만들어짐. 여러번 요청해도 한번 만들어진 생성자를 기억해놓고 그걸 계속 쓴다!
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		some++;
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
		System.out.println("필드값: "+ some);
		
		//some은 계속 올라간다. 
	}
	
}
