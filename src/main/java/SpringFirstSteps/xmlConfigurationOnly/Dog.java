package SpringFirstSteps.xmlConfigurationOnly;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog Bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bark-bark");
    }
}
