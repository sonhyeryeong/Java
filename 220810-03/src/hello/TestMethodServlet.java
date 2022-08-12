package hello;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name ="TestMethodServlet", urlPatterns = "/testMethod"
			, initParams = @WebInitParam(name ="name1" , value ="value1")
			,loadOnStartup =1) //web.xml에서 설정한 것처럼 서블릿을 mapping할 수 있다. 실행할 때 읽고 해석함.!
//loadOnStartup값을 설정하면 서버가 구동될 때 서블릿이 미리 만들어진다!
public class TestMethodServlet extends HttpServlet {
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		 System.out.println("해당 서블릿을 생성할 때 호출됩니다.");
		 System.out.println("ServletConfig 객체는 설정한 init param에 접근 가능합니다. ");
		 System.out.println(config.getInitParameter("name1"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet(req,resp);
		resp.setStatus(405);//이 방식은 지원 안하니까 하지 말라고 에러코드를 알려준다!
		
	}

	
	
	
}
