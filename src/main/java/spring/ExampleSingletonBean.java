package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ExampleSingletonBean {

    private AnotherInjectedBean anotherInjectedBean;

    @Autowired
    public ExampleSingletonBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
    }

    public void exampleMethod(){
        anotherInjectedBean.someMethod();
    }

    public AnotherInjectedBean getAnotherInjectedBean() {
        return anotherInjectedBean;


    }
}
