package kr.co.greenart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	private final static Logger logger = LoggerFactory.getLogger(BoardServlet.class);
	
	private BoardService service;//객체가  초기화 되어 있어야 한다 
	
	//객체 초기화. 
	@Override
	public void init(ServletConfig config) throws ServletException {
		service= new BoardService(new BoardDAO());
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("사용자가 GET방식의 요청을 하였습니다.(게시판 목록)");
		logger.info("logger를 통해 메세지를 남깁니다. ");//프로그램 흐름 같은게 간단하게 보고 싶을 때 info를 쓴다. 
		logger.info("사용자가 Get 요청함. (게시판 목록)");
		
		//slf4j - 중요도 높음<< fatal/error/warn/info/debug >> 중요도 낮음 
		//debug는 기록을 볼 지 안 볼지를 선택할 수 있다. 
		
		
		List<BoardArticle> articles =service.게시글목록보기서비스();
		req.setAttribute("articles", articles);
		
		req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
	
	}
		
}


