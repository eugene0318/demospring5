package me.whiteship.demospring51;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler{
	
	
	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public void handle(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().toString());
		System.out.println("이벤트 받았다, 데이터는 "+event.getData());
	}
	
}
