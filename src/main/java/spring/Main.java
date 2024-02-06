package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        trzeba zmienić typ referencji na Abstract bo na tej nie ma metody closed
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("start context");
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("after context");

        System.out.println("start bean");
        AnotherInjectedBean bean = applicationContext.getBean(AnotherInjectedBean.class);
        System.out.println("after bean");

        System.out.println("start some method");
        bean.someMethod();
        System.out.println("after some method");

        System.out.println("start destroy");
        applicationContext.close();
        System.out.println("after destroy");

//        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
