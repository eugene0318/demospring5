package me.whiteship.demospring51;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import me.whiteship.out.MyService;

@SpringBootApplication
public class Demospring51Application {
	
	@Autowired 
	MyService myService;

	public static void main(String[] args) {
		//SpringApplication.run(Demospring51Application.class, args);
		var app = new SpringApplication(Demospring51Application.class);
		
//		 app.addInitializers(new ApplicationContextInitializer<GenericApplicationContext>() {
//
//			@Override
//			public void initialize(GenericApplicationContext ctx) {
//				// TODO Auto-generated method stub
//				ctx.registerBean(MyService.class);
//			}    // GenericApplicationContext로 설정
//	           
//	        });
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
		
			ctx.registerBean(MyService.class);
			ctx.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {	
					@Override
					public ApplicationRunner get() {
						// TODO Auto-generated method stub
						return new ApplicationRunner() {
							
							@Override
							public void run(ApplicationArguments args) throws Exception {
								// TODO Auto-generated method stub
								System.out.println("Funcional Bean Definition!!");
							}
						};
					}
				});
			});
		app.run(args);
	}

}
