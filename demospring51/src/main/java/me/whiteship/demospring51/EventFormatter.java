package me.whiteship.demospring51;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
//@Component
public class EventFormatter implements Formatter<Event>{
	
//	@Autowired
//	MessageSource messageSource;

	@Override
	public Event parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return new Event(Integer.parseInt(text));
	}

	@Override
	public String print(Event object, Locale locale) {
		// TODO Auto-generated method stub
		return object.getId().toString();
	}

	
	
}
