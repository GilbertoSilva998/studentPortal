package za.ac.cput.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fleet {
    private List<Car> cars;

    //--------------- Constructors -----------------------------

    public Fleet() {
        this.cars = new ArrayList<>();
    }

    //--------------- Getters ---------------------------------

    public List<Car> getCars() {
        return cars;
    }

    //--------------- Add Car to Fleet ------------------------

    public void addCar(Car car) {
        cars.add(car);
    }

    //--------------- Remove Car from Fleet --------------------

    public void removeCar(Car car) {
        cars.remove(Car);
    }

    //--------------- Equals and HashCode ---------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fleet fleet = (Fleet) o;
        return Objects.equals(cars, fleet.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
