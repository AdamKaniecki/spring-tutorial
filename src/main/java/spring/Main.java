package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
       ExampleSingletonBean exampleSingletonBean1 = applicationContext.getBean(ExampleSingletonBean.class);
       ExampleSingletonBean exampleSingletonBean2 = applicationContext.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean examplePrototypeBean1 = applicationContext.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean examplePrototypeBean2 = applicationContext.getBean(ExamplePrototypeBean.class);

        System.out.println("singleton1 == singleton2 " + (exampleSingletonBean1 == exampleSingletonBean2));
        System.out.println("prototype1 == prototype2 " + (examplePrototypeBean1 == examplePrototypeBean2));


    }
}
