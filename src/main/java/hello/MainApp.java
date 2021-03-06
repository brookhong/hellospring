package hello;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import org.springframework.beans.factory.xml.XmlBeanFactory;
// import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        // XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        // HelloWorld objA = (HelloWorld) factory.getBean("helloWorld");

        context.start();

        objA.getMessage();
        objA.setMessage("I'm object A");
        objA.getMessage();
        objA.spellCheck();
        HelloWorld objB = (HelloWorld) context.getBean("helloChina");
        objB.getMessage();
        objB.spellCheck2();
        objB.spellCheck3();

        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();

        context.registerShutdownHook();
        context.stop();
    }
}
