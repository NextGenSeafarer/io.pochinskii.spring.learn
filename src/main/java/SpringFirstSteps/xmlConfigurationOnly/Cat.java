package SpringFirstSteps.xmlConfigurationOnly;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat Bean is created");
    }

    @Override
    public void say(){
        System.out.println("meow!");
    }
}
