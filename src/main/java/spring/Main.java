package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        ExampleBean bean = applicationContext.getBean(ExampleBean.class);
        bean.someMethod();
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
