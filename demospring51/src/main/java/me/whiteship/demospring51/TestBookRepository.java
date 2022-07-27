package me.whiteship.demospring51;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("!prod")
public class TestBookRepository implements BookRepository{

}
