//파일 업로드 연습
//톰캣 서버에 바로 업로드 했음
package file;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/fileupload")
@MultipartConfig(location="d:\\temp", fileSizeThreshold = 10*1024*1024 //location은 임시폴더 fileSizeThreshold는 용량지정
							,maxFileSize=50*1024*1024)
public class FileServlet extends HttpServlet{
	//config에서 지정한 용량을 넘어가게 되면 디스크를 활용함. 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Part p = req.getPart("fileupload");//설정한 파라미터 이름을 넣는다. 
		System.out.println(p.getName());
		System.out.println(p.getSubmittedFileName());
		for(String header : p.getHeaderNames()) {
			System.out.println(header + " : "+p.getHeader(header));
		}
		
		String contextPath = getServletContext().getRealPath("");
		System.out.println("경로 :"+contextPath);
		
		Path directory = Paths.get(contextPath);//문자열로 되어있는 경로를 넣어주면 해당 경로를 가르키는 path객체가 된다. 
		//해당경로에 해당파일 이름으로 복사를 할 거임!
		//files메소드는 파일 입출력을 할 수 있는 메소드의 집합체. 
		Files.copy(p.getInputStream(), directory.resolve(p.getSubmittedFileName()), StandardCopyOption.REPLACE_EXISTING);
		
		resp.sendRedirect("/"+URLEncoder.encode(p.getSubmittedFileName(),"UTF-8"));//루트경로로 
		
	}
	
}
