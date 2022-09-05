package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

//설정 파일을 표시하고 설정을 읽을 수 있게 해준다. 
@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties" )//value=내가 읽고자 하는 properties 를 적어준다. 
public class RootConfig {
	@Value("${jdbc.drivername}")//value값을 읽어서 변수로 넣어줌
	private String drivername;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
	
	@Autowired
	private DataSource ds; 
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	
	@Bean
	@Autowired//메소드 위에 적으면 필요한 의존성을 주입하게 되어있다. 
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);//파라미터로 datasource가 필요함. 
	}

}
