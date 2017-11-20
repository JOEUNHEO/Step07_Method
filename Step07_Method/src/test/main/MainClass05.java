package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		// useCar(Car car) 메소드를 호출해 보세요.
		MyUtil.useCar(car);
		
		// userCar(String msg, Car car) 메소드를 호출해 보세요.
		MyUtil.userCar("msg", car);
	}
}
