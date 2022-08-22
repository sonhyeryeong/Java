import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.example.AppleSearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main3 {
	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
		String apiURL="https://itunes.apple.com/search?term=";//요청을 보내고자 하는 주소
		
		String requestURL = apiURL + URLEncoder.encode("아이유","UTF-8");
		
		//해당 주소로 get방식의 요청을 보낸다
		URL url = new URL(requestURL);
		HttpURLConnection conn = null; 
		try {
			conn =  (HttpURLConnection) url.openConnection(); //다운캐스팅한다. 
			conn.setRequestMethod("GET");
			
			int responseCode = conn.getResponseCode(); //응답 코드를 살펴본다. 
			if(responseCode == HttpURLConnection.HTTP_OK) {
				//응답body를 살펴본다.
				String respBody = readBody(conn.getInputStream());//private한 메소드 
//				System.out.println(respBody);
				
				ObjectMapper mapper= new ObjectMapper();
				AppleSearchResult apple = mapper.readValue(respBody, AppleSearchResult.class);
				System.out.println(apple.getResultCount());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				conn.disconnect();//닫아주어야 한다. 
			}
		}

	}

	private static String readBody(InputStream inputStream) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder sb = new StringBuilder();
		
		String line;
		while((line = br.readLine())!=null) {//한 줄씩 읽는다
			sb.append(line);
		}
		return sb.toString();
		
	}
}
