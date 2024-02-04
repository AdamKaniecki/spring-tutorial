package spring;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {
    public InjectedBean() {
        System.out.println("injected Bean");
    }
}
