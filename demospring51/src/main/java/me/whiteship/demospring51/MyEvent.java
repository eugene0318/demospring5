package me.whiteship.demospring51;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

	private int data;

	private Object soure;
//	
//	public Object getSource() {
//		return source;
//	}

	public MyEvent(Object source, int data) {
		// super(source);
		this.soure = source;
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	public Object getSoure() {
		return soure;
	}

	public void setSoure(Object soure) {
		this.soure = soure;
	}

	public int getData() {
		return data;
	}
}
