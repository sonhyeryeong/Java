import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import sun.net.www.protocol.http.HttpURLConnection;

public class Main4 {
	public static void main(String[] args) throws MalformedURLException {
		String apiURL = "https://httpbin.org/post";
		URL url = new URL(apiURL);
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");//보내는거 제이슨이라고 말하는거 
			conn.setRequestProperty("Accept", "application/json");//받는것도 제이슨이였으면 좋겠다고 설정
			conn.setDoOutput(true);
			//요청헤더를 만든다??
			//미디어 타입(media type), MIME 타입(MIME type)을 만든다?
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(new Person("홍길동",22));
			
			byte[] body = json.getBytes();
			
			conn.getOutputStream().write(body,0,body.length);
			if(conn.getResponseCode() ==200 ) {
				System.out.println(readBody(conn.getInputStream()));
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				conn.disconnect();
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
