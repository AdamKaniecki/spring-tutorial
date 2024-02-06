package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ExamplePrototypeBean {

    private AnotherInjectedBean anotherInjectedBean;

    @Autowired
    public ExamplePrototypeBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
    }

    public AnotherInjectedBean getAnotherInjectedBean() {
        return anotherInjectedBean;
    }

    public void exampleMethod(){
        anotherInjectedBean.someMethod();
    }
}
