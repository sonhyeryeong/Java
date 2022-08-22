import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main7 {
	private static String getSaraminInfo(String url) throws IOException {
		Document doc = Jsoup.connect(url).timeout(5000).get();
		String info = doc.select("meta[name=description]").first().attr("content");//어트리뷰트값을 찾아온다. 
		return info;
	}
	
	
	public static void main(String[] args) throws IOException {
		String searchURL = "https://www.saramin.co.kr/zf_user/search?search_area=main&search_done=y&search_optional_item=n&searchType=search&searchword=%EC%9E%90%EB%B0%94";
		String startString = "/zf_user/jobs/relay/view";
		
		//응답이 온 html객체를 문서로 
		Document doc = Jsoup.connect(searchURL).timeout(5000).get();//timeout() : 이 요청을 최대한 기다려 줄 시간 
		Elements links = doc.select("a[href]");
		
		Set<String> set = new HashSet<>();
		for(Element e : links) {
			String attr=e.attr("href");
			if(attr.startsWith(startString)) {
				set.add("http://www.saramin.co.kr"+attr);
			}
		}

//		for(String url : set) {
//			System.out.println(getSaraminInfo(url));
//		}
		
		//한번에 여러개의 요청을 하고, 응답이 오면 응답이 오는 순서대로 출력하는거
		set.parallelStream().map(url ->{
			try {
				return getSaraminInfo(url);
			}catch(IOException e1) {
				e1.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
		
		
		
		
	}
}
