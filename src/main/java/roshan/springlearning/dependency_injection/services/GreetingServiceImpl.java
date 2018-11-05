package roshan.springlearning.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String GREETING_MESSAGE = "Welcome to Spring !";

    @Override
    public String sayGreeting() {
        return GREETING_MESSAGE;
    }
}
