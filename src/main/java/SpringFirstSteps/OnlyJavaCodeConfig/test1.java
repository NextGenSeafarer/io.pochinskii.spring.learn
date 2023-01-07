package SpringFirstSteps.OnlyJavaCodeConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Human human = context.getBean("humanBean", Human.class);
        human.speak();
        context.close();
        System.out.println("Здесь работает @Autowired потому что CatOwner имеет один конструктор с внедряемым элементом");
        System.out.println("------------------------------------------------------");

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        Cat cat = context2.getBean("catBean", Cat.class);
        cat.makeNoise();
        Person person = context2.getBean("personBean", Person.class);
        System.out.println("Name of the person from myApp.properties: " + person.getName());
        context2.close();
    }

}

@Component("humanBean")
class Human {

    Human() {
        System.out.println("Human bean is created!");
    }


    void speak() {
        System.out.println("Human is speaking");
    }
}

@Component("catBean")
class Cat {
    Cat() {
        System.out.println("Cat bean is created");
    }

    void makeNoise() {
        System.out.println("Cat is destroying something");
    }
}

class CatOwner {
    private Cat cat;

    public CatOwner(Cat cat) {
        System.out.println("Constructor CatOwner:: DI");
        this.cat = cat;
    }
}

class Person{
    @Value("${person.name}")
    private String name;

    public String getName() {
        return name;
    }
}