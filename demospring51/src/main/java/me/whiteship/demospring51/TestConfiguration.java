package me.whiteship.demospring51;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("TEST")
public class TestConfiguration {
	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}
}
