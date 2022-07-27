package me.whiteship.demospring51;

import javax.naming.spi.ObjectFactory;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.stereotype.Component;

@Component
public class Single {
	@Autowired
	private Proto proto;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public Proto getProto() {
		return proto;
	}
	 
}
