package roshan.springlearning.dependency_injection.Controller;

import org.springframework.stereotype.Controller;
import roshan.springlearning.dependency_injection.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
