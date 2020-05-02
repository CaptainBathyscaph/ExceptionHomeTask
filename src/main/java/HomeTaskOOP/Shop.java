package HomeTaskOOP;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Car> shop = new ArrayList();


    public void addCar(Car car) throws OutOfFreePlaceException {
        if (shop.size() > 4)
        {
            throw new OutOfFreePlaceException();
        }
        if (car.length > 5760  || car.width > 2030 || car.height > 1950 )
        {
            throw new TooBigCarException();
        }

        shop.add(car);
    }

    public void getCarName(Car car)
    {
      car.getModelName();
    }

    public void printCars() {
        for (Car car : shop) {
            System.out.println(car);
        }

    }

    public void printCoast() {
        for (Car car : shop
        ) {
            System.out.println("Model: " + car.getModelName() + " Coast = " + car.getCost() + " $");

        }
    }

    public void carSale(Car car) {
        System.out.println("Car " + car.getModelName() + " was sold");
        shop.remove(car);
    }


}
