package me.whiteship.demospring51;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;

import javax.el.Expression;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AppRunner implements ApplicationRunner {
//	@Autowired
//	Single single;
//	
//	@Autowired
//	Proto proto;

//	@Autowired
//	MessageSource messageSource;
//	
//	@Autowired
//	ApplicationEventPublisher publishEvent;
//
//	@Autowired
//	ResourceLoader resourceLoader;

//	@Autowired
//	BookRepository bookRepository;

//	@Value("${app.name}")
//	String appName;

	@Autowired
	ApplicationContext resourceLoader;

	@Autowired
	Validator validator;
	
	@Autowired
	ConversionService conversionService;
	
	@Value("#{1+1}")
	int value;
	
	@Value("#{'hello'+' world'}")
	String greeting;
	
	@Value("#{1 eq 1}")
	boolean trueOrfalse;
	
	@Value("${my.value}")
	int myValue;
	
	@Value("#{${my.value} eq 100}")
	boolean myValue100;
	
	@Value("#{'spring'}")
	String spring;
	
	@Value("#{sample.data}")
	int sampleData;
	
	@Autowired
	EventService eventService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		eventService.createEvent();
		eventService.publishEvent();
//		System.out.println("==================");
//		System.out.println(value);
//		System.out.println(greeting);
//		System.out.println(trueOrfalse);
//		System.out.println(myValue);
//		System.out.println(myValue100);
//		System.out.println(spring);
//		System.out.println(sampleData);
//		
//		ExpressionParser parser = new SpelExpressionParser();
//		org.springframework.expression.Expression expression = parser.parseExpression("2+100");
//		Integer value =expression.getValue(Integer.class);
//		System.out.println(value);
//	System.out.println(conversionService.getClass().toString());
//		Event event = new Event();
//		EventValidator eventValidator = new EventValidator();
//		
//		Errors errors = new BeanPropertyBindingResult(event, "event"); //target, name 
//		
//		eventValidator.validate(event, errors);
//		
//		System.out.println(errors.hasErrors());
//		
//		errors.getAllErrors().forEach(e->{
//			
//			System.out.println("===========error code==============");
//			
//			Arrays.stream(e.getCodes()).forEach(System.out::println);
//			System.out.println(e.getDefaultMessage());
//		});
//		
//		System.out.println(resourceLoader.getClass());
//		Resource resource = resourceLoader.getResource("classpath:test.txt"); 
//		System.out.println(resource.getClass());
//		System.out.println(resource.exists()); //
//		System.out.println(resource.getDescription()); //
//		System.out.println(Files.readString(Path.of(resource.getURI())));

		// publishEvent.publishEvent(new MyEvent(this, 100));

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

		// System.out.println(appName);

		// System.out.println(Arrays.toString(environment.getDefaultProfiles()));

	}

}
