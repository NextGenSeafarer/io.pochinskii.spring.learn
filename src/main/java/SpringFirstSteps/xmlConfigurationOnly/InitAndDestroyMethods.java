package SpringFirstSteps.xmlConfigurationOnly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyMethods {

    /*
    init method - метод, который будет вызван после создания бина для какой - либо конфигурации (для scope = singleton
    будет вызван единожды, а для prototype - столько раз, сколько будет запрошен бин).

    destroy method - метод, который будет вызван после закрытия spring container (Для singleton), для prototype - вызван не будет

     */
    private void init(){
        System.out.println("Init method ::");
    }
    private void destroy(){
        System.out.println("Destroy method ::");
    }

    public static void main(String[] args) {
        System.out.println("Singleton: ");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfigurationOnly/beanScope.xml");
        InitAndDestroyMethods iad = context.getBean("bean3", InitAndDestroyMethods.class);
        context.close();
        System.out.println("***");
        System.out.println("Prototype: ");
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("xmlConfigurationOnly/beanScope.xml");
        InitAndDestroyMethods iad2 = context2.getBean("bean4", InitAndDestroyMethods.class);
        InitAndDestroyMethods iad3 = context2.getBean("bean4", InitAndDestroyMethods.class);
        InitAndDestroyMethods iad4 = context2.getBean("bean4", InitAndDestroyMethods.class);
        context2.close();


    }

}
