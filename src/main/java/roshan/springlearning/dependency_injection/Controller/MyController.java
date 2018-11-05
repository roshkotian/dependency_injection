package roshan.springlearning.dependency_injection.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String greetingMessage(){
        System.out.println("Hello Roshan !");
        return "Hello Roshan !";
    }
}
