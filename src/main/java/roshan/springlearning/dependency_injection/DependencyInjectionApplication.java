package roshan.springlearning.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import roshan.springlearning.dependency_injection.Controller.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.greetingMessage();
    }
}
