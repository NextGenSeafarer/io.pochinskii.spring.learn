package SpringFirstSteps.xmlConfigurationOnly;

/*

    Spring container - читает configuration file, создает и содержит в себе объекты
    Функции spring container:
    IoC - создание и управление объектами
    DI - dependency injection

    IoC - Inversion of control - это аутсорсинг создания и управления объектами. Т.е. передача программистом прав
    на создание и управление объектами Spring-у.
    Spring container может быть сконфигурирован с помощью:
    - XML file
    - Annotations + XML file
    - Java code

    Bean - это объект, который создается и управляется Spring Container

    DI - это аутсорсинг добавления/внедрения зависимостей. DI делает объекты нашего приложения слабо зависимыми
    друг от друга
    Можно внедрять через:
    Конструктор
    Сеттер
    @Autowired

*/


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
    public static void main(String[] args) {
        // создаем контейнер
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlConfigurationOnly/applicationContext.xml");
        // вызываем bean из applicationContext
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        System.out.println("------------------------------------------------------");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println("Person surname: " + person.getSurname());
        System.out.println("Person age: " + person.getAge());
        System.out.println("Person department: " + person.getDepartment());



        context.close();

    }
}
