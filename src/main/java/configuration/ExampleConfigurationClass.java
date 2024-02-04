package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.AnotherInjectedBean;
import spring.ExampleBean;
import spring.InjectedBean;
import spring.Main;

@Configuration
// poprostu tu trzeba sobie zapewnić ComponentScanning żeby Spring wyłapywał ...
//... Beany po aplikacji- w przypadku konfiguracji niejawnej

//w przypadku konfiguracji jawnej wypisuje się Beany w klasie konfiguracyjnej
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

//    @Bean
//    public ExampleBean exampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
////        System.out.println("before Calling constructor");
//        return new ExampleBean(injectedBean, anotherInjectedBean);
//
//    }

//    @Bean
//    public InjectedBean injectedBean() {
//        return new InjectedBean();
//    }
//
//    @Bean
//    public AnotherInjectedBean anotherInjectedBean() {
//        return new AnotherInjectedBean();
//    }

}
