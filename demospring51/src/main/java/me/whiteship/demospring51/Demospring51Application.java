package me.whiteship.demospring51;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
//@PropertySource("classpath:/app.properties")
public class Demospring51Application {
//	
//	@Autowired 
//	MyService myService;

	public static void main(String[] args) {
		SpringApplication.run(Demospring51Application.class, args);
		//var app = new SpringApplication(Demospring51Application.class);
		
//		 app.addInitializers(new ApplicationContextInitializer<GenericApplicationContext>() {
//
//			@Override
//			public void initialize(GenericApplicationContext ctx) {
//				// TODO Auto-generated method stub
//				ctx.registerBean(MyService.class);
//			}    // GenericApplicationContext로 설정
//	           
//	        });
//		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
//		
//			ctx.registerBean(MyService.class);
//			ctx.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {	
//					@Override
//					public ApplicationRunner get() {
//						// TODO Auto-generated method stub
//						return new ApplicationRunner() {
//							
//							@Override
//							public void run(ApplicationArguments args) throws Exception {
//								// TODO Auto-generated method stub
//								System.out.println("Funcional Bean Definition!!");
//							}
//						};
//					}
//				});
//			});
//		app.run(args);
	}
	
//	@Bean
//	public MessageSource messageSource() {
//		var messageSource = new ReloadableResourceBundleMessageSource();
//		messageSource.setBasename("classpath:/messages");
//		messageSource.setDefaultEncoding("UTF-8");
//		messageSource.setCacheSeconds(3);
//		return messageSource;
//	}

}
