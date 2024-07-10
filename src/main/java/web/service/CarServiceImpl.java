package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();
    private List<Car> cars;

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public int getCountAllCar(List<Car> cars) {
        return carDao.getCountAllCar(cars);
    }
}
