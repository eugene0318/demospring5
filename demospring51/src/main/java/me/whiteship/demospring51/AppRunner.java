package me.whiteship.demospring51;

import java.util.Arrays;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements ApplicationRunner{
//	@Autowired
//	Single single;
//	
//	@Autowired
//	Proto proto;
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	ApplicationEventPublisher publishEvent;
	
//	@Autowired
//	BookRepository bookRepository;
	
//	@Value("${app.name}")
//	String appName;
//	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		publishEvent.publishEvent(new MyEvent(this, 100));
		
		// TODO Auto-generated method stub
//		while (true) {
//
//			System.out.println(messageSource.getMessage("greeting", new String[] {"keesun"}, Locale.KOREA));
//			System.out.println(messageSource.getMessage("greeting", new String[] {"keesun"}, Locale.getDefault()));
//			
//			Thread.sleep(1000l);
//		}
//		Environment environment = ctx.getEnvironment();
//		System.out.println(environment.getProperty("app.name"));
//
//		System.out.println(environment.getProperty("app.about"));
		
		//System.out.println(appName);
		
		//System.out.println(Arrays.toString(environment.getDefaultProfiles()));
	 	
	}
	
}
