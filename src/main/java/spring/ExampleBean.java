package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {


    private AnotherInjectedBean anotherInjectedBean;

    private SomeCommonInterface someCommonInterface;

    public ExampleBean(AnotherInjectedBean anotherInjectedBean, SomeCommonInterface someCommonInterface) {
        this.anotherInjectedBean = anotherInjectedBean;
        this.someCommonInterface = someCommonInterface;
        System.out.println("calling Example Bean constructor");
    }
public void someMethod(){
    System.out.println("calling example method: " + someCommonInterface + ", " + anotherInjectedBean);
}
}
