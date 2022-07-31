package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ProxySimpleEventService implements EventService {
	
	@Autowired
	EventService simpleEventService;
	
	@Override
	public void createEvent() {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		simpleEventService.createEvent();
		System.out.println(System.currentTimeMillis()-begin);
	}

	@Override
	public void publishEvent() {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		simpleEventService.publishEvent();
		System.out.println(System.currentTimeMillis()-begin);
	}

	
}
