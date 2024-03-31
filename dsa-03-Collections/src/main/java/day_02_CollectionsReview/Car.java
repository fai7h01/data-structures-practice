package day_02_CollectionsReview;

import java.util.Objects;

public class Car {
    int id;
    String make;

    public Car(int id, String make) {
        this.id = id;
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make);
    }
}
