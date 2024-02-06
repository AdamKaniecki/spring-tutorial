package spring;

import org.springframework.stereotype.Component;

@Component
public class AnotherInjectedBean {
    public AnotherInjectedBean() {
        System.out.println("calling Another Injected Bean");
    }

    public void initMethod(){
        System.out.println("Another Bean initMethod");
    }

    public void destroyMethod() {
        System.out.println("Another Bean destroyMethod");

    }
    public void someMethod(){
        System.out.println("calling Another Injected Bean some method");
    }
    }
