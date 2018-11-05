package roshan.springlearning.dependency_injection.Controller;

import org.springframework.stereotype.Controller;
import roshan.springlearning.dependency_injection.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingServiceImpl;

    String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}

