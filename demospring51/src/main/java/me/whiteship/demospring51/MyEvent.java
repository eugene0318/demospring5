package me.whiteship.demospring51;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	private int data;
	
	private Object soure;
	
	public Object getSource() {
		return source;
	}
	

	public MyEvent(Object source, int data) {
		super(source);
		this.data = data; 
		// TODO Auto-generated constructor stub
	}


	public int getData() {
		return data;
	}
}
