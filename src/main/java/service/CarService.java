package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Infernus", 1986, "Red"));
        cars.add(new Car("Banshee", 1984, "Black"));
        cars.add(new Car("Hermes", 1983, "Blue"));
        cars.add(new Car("Sabre", 1987, "White"));
        cars.add(new Car("Stallion", 1983, "Silver"));

    }

    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}