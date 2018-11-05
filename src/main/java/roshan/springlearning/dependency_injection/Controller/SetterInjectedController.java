package roshan.springlearning.dependency_injection.Controller;

import org.springframework.stereotype.Controller;
import roshan.springlearning.dependency_injection.services.GreetingService;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
