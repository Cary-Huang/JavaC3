package com.zz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}
	/**
	@Bean
	public EmbeddedServletContainerCustomizer comtainerCustomer(){
		return new EmbeddedServletContainerCustomizer() {
			
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				// TODO Auto-generated method stub
				ErrorPage errorCommonPage=new ErrorPage(HttpStatus.NOT_FOUND,"/error.html");	
				ErrorPage errorCommonPage1=new ErrorPage(HttpStatus.OK,"/error.html");	
				container.addErrorPages(errorCommonPage,errorCommonPage1);
			}
			
		};
	}**/

}
