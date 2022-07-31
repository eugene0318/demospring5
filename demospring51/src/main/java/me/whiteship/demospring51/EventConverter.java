package me.whiteship.demospring51;

import javax.xml.transform.Source;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
//@Component
public class EventConverter {
	
	public static class StringToEventConvert implements Converter<String, Event>{

		@Override
		public Event convert(String source) {
			// TODO Auto-generated method stub
			return new Event(Integer.parseInt(source));
		}

		@Override
		public JavaType getInputType(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public JavaType getOutputType(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
	
	public static class EventToStringConverter implements Converter<Event, String>{

		@Override
		public String convert(Event source) {
			// TODO Auto-generated method stub
			return source.getId().toString();
		}

		@Override
		public JavaType getInputType(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public JavaType getOutputType(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}

}
