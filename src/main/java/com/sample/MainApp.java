package com.sample;

import com.sample.controller.GreetingController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingController controller = (GreetingController) context.getBean("greetingController");
        controller.processGreeting("Hello, Spring!");
    }
}
