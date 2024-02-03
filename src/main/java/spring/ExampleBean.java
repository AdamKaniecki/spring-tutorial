package spring;

import org.springframework.context.annotation.Configuration;


public class ExampleBean {
    private final InjectedBean injectedBean;
    private final AnotherInjectedBean anotherInjectedBean;

    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean injectedBean1) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = injectedBean1;
        System.out.println("calling ExampleBean constructor");
    }

    public void exampleMethod(){
        System.out.println("calling example method");
    }
}
