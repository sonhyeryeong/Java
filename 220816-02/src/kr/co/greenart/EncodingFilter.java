package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

//어노테이션으로 주면 순서를 줄 수 없음. web.xml에서는 순서 설정 가능
@WebFilter(filterName = "EncodingFilter", urlPatterns ="/*" // "/*": 해당 주소의 사용자가 보내는 모든 요청을 처리하고자 할 때 사용함. 서블릿의 경우에는 안 쓴다.  
				,initParams =@WebInitParam(name="encoding", value ="UTF-8"))
public class EncodingFilter implements Filter {
	private String encoding;
	//객체가 필요할 때 한 번 호출된다. 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
	}

	
	
	                                                                
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);//원래 흐름으로 돌아가게 한다. 
		
	}
	
	//initparameter란 사용하고 싶은 값을 미리 설정하는 것! -> encoding이란 객체에 utf-8이라는 값이 담겼다! 
	
}
