package me.whiteship.demospring51;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler implements ApplicationListener<MyEvent> {
	
	
	@Override
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 받았다, 데이터는 "+event.getData());
	}
	
}
