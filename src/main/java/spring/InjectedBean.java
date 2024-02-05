package spring;

import org.springframework.stereotype.Component;

@Component
public class InjectedBean {

    public InjectedBean() {
        System.out.println("calling Injected Bean");
    }
}
