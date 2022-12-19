package SpringFirstSteps.xmlConfigurationOnly;

public class Person {
    private String surname;
    private int age;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Pet pet;

    public Person() {
        System.out.println("Person Bean is created");
    }

    public Person(Pet pet) {
        System.out.println("Person Bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my Pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Bean is created by setter");
        this.pet = pet;
    }
}
