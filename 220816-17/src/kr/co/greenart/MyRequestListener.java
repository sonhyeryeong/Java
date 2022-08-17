package kr.co.greenart;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener{
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {//setAttribute될 때 실행된다.-설정될 때 
		System.out.println("요청 객체에 attribute가 설정되었음. ");
		System.out.println(srae.getName() +" : " + srae.getValue());//보안상의 문제가 있을 수 있으니 테스트용으로만. 
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {//사용자가 요청 할 때마다 무슨 주소를 요청했는지 살펴 볼 수 있겠다!!
		System.out.println("사용자 요청이 발생했을 때 이벤트~");
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		System.out.println(req.getRequestURI()+"를 요청하였음.");
		
	}
	
	
}
