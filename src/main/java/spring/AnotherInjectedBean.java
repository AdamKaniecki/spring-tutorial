package spring;

import org.springframework.stereotype.Component;

@Component
public class AnotherInjectedBean {
    public AnotherInjectedBean() {
        System.out.println("calling Another Injected Bean");
    }
}
