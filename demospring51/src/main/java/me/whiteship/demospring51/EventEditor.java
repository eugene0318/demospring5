package me.whiteship.demospring51;
import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

	
	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		Event event = (Event)getValue();
		return event.getId().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		setValue(new Event(Integer.parseInt(text)));
	}
	
}
