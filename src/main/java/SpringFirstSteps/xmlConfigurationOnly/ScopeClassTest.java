package SpringFirstSteps.xmlConfigurationOnly;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/*

Bean Scope - это определение жизни нашего бина.
Существуют несколько типов, но основные - это
Singleton - является стандартным, когда мы явно не указываем scope
Prototype

Разница в том, что singleton подходит для stateless объектов, которые не хранят состояние, т.е.
у них нет, к примеру, имени, т.к. будет создаваться всегда 1 объект (пример с myDog & yourDog),
при создании таким способом - бин будет создан сразу после чтения xml файла и при изменении полей, будут меняться
все объекты, т.к. они ссылаются на один бин

В это же время prototype будет создавать объект такого бина только когда будет обращение к нему и он подходит для
stateful объектов


*** Singleton
<bean id="beanScopeTest1"
      class="SpringFirstSteps.BeanScope"
      scope="singleton">
</bean>

*** Prototype
<bean id="beanScopeTest1"
      class="SpringFirstSteps.BeanScope"
      scope="prototype">
</bean>

*/
public class ScopeClassTest {

    private String name;

    public ScopeClassTest() {
        System.out.println("bean is created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter for ScopeTestBean::");
        this.name = name;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfigurationOnly/beanScope.xml");
        ScopeClassTest sc1 = context.getBean("bean1", ScopeClassTest.class);
        sc1.setName("TEST1");
        ScopeClassTest sc2 = context.getBean("bean1", ScopeClassTest.class);
        sc2.setName("TEST2");
        System.out.println("Singleton Bean 1 -> name: " + sc1.getName() + ", address : " + sc1);
        System.out.println("Singleton Bean 2 -> name: " + sc2.getName() + ", address : " + sc2);
        System.out.println("***");

        ScopeClassTest sc3 = context.getBean("bean2", ScopeClassTest.class);
        sc3.setName("AAA");
        ScopeClassTest sc4 = context.getBean("bean2", ScopeClassTest.class);
        sc4.setName("BBB");
        System.out.println("Prototype Bean 1 -> name: " + sc3.getName() + ", address : " + sc3);
        System.out.println("Prototype Bean 2 -> name: " + sc4.getName() + ", address : " + sc4);
        context.close();

    }
}
