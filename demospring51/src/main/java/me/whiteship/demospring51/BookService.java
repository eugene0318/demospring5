package me.whiteship.demospring51;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository myBookRepository;
    //List<BookRepository> bookRepositories;
    
//    public void printBookRepository() {
//    	//System.out.println(bookRepository.getClass());
//    	this.bookRepositories.forEach(System.out::println);
//    }
    
    @PostConstruct
    public void setup() {
    	System.out.println(myBookRepository.getClass());
    }

}

