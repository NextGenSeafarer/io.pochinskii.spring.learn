package SpringFirstSteps.xmlAndAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
class Car {
    @Value("${car.model}")
    private String model;
    @Value("${car.year}")
    private int year;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Car(String model, int year) {
        System.out.println("Car bean is created");
        this.model = model;
        this.year = year;
    }

    public Car() {
        System.out.println("Car bean is created");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
