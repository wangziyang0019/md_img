package com.jhcoder.top;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
@MapperScan("com.jhcoder.top.mapper")
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//Tomcat large file upload connection reset
	@Bean
	public TomcatServletWebServerFactory tomcatEmbedded() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
			if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
				//-1 means unlimited
				((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
			}
		});
		return tomcat;
	}
}
