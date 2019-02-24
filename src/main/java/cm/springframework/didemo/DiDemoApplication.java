package cm.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cm.springframework.didemo.controllers.ConstructorInjectedController;
import cm.springframework.didemo.controllers.MyController;
import cm.springframework.didemo.controllers.PropertyInjectedController;
import cm.springframework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctxt.getBean("myController");
		
		
		System.out.println(controller.hello());
		System.out.println(ctxt.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctxt.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctxt.getBean(ConstructorInjectedController.class).sayHello());
	}

}
