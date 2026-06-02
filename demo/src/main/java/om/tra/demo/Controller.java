package om.tra.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("greet")
    public String greeting(@RequestParam String name, @RequestParam String age){
        return "Hi " + name + "Your age is: " + age ;
    }

    @GetMapping("Books")
    public List<Book> Book(){

        return Arrays.asList(
           new Book("The Hobbit", "221"),
           new Book("Animal Farm", "332"),
           new Book("The Hunger Games", "442"),
           new Book("The Diary of a Young Girl", "553")
        );
    }
t

}

