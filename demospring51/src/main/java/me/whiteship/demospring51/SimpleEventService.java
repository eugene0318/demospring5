package me.whiteship.demospring51;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{
	@PerfLoggin
	@Override
	public void createEvent() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("created an event");
		
	}
	//@PerfLoggin
	@Override
	public void publishEvent() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("published an event");
	}

	
}
