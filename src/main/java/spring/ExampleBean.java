package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private  InjectedBean injectedBean;
    private  AnotherInjectedBean anotherInjectedBean;

//jeśli są 2 kontruktory i mam adnotację @Autowired to Spring wybierze ten konstruktor z adnotacją @Autowired

    @Autowired
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling constructor Example Bean(2)");
    }


    public ExampleBean() {
        System.out.println("Calling constructor Example Bean()");
    }

    public void exampleMethod() {
        System.out.println("calling last");
    }
}
