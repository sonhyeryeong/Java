package hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.Person;
import person.PersonDAO;
import person.PersonValidator;

public class PersonServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println(req.getCharacterEncoding()); 인코딩 기본 값은 null이다!!!
		req.setCharacterEncoding("utf-8");//보내기 전에 인코딩을 해준다. 
		
		
		
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String number = req.getParameter("age");
		String email = req.getParameter("email");
		
		
		PersonValidator validator = new PersonValidator();
		Map<String, String> errors = new HashMap<String,String>();
		errors.putAll( validator.isValidName(firstName));
		errors.putAll( validator.isValidName(lastName));
		errors.putAll( validator.isValidAge(number));
		errors.putAll( validator.isValidEmail(email));
		
		
		if(errors.size() > 0) {//에러가 있으면 다시 폼으로 가는거임!
			//잘못된 값일 때 사용자에게 뭐라고 해야하지??
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("form.jsp").forward(req, resp);
		}else {//에러가 없으면 그대로 진행~~
			
			PersonDAO dao = new PersonDAO();
			
			try {
				dao.insert(new Person(firstName, lastName,Integer.valueOf(number),email));
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			//목록 페이지로 보낼거임~~
			resp.sendRedirect(req.getContextPath()+"/list");
			
		}
		
		
	}
	
}
