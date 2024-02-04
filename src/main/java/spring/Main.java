package spring;

import configuration.ExampleConfigurationClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
//        ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);
//        exampleBean.exampleMethod();
    }
}
