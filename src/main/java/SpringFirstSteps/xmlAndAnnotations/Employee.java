package SpringFirstSteps.xmlAndAnnotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {
    @Value("${person.surname}")
    private String name;
    @Value("${person.department}")
    private String department;
    @Value("${person.age}")
    private int age;

    private Car car;

    public Employee() {
        System.out.println("Employee bean is created");
    }

    public Employee(String name, String department, int age, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.car = car;
    }

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    @Autowired
    public void drive(Car car) {
        System.out.println("Employee is driving " + car.getModel() + ", " + car.getYear());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}


