package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		// useCar(Car car) �޼ҵ带 ȣ���� ������.
		MyUtil.useCar(car);
		
		// userCar(String msg, Car car) �޼ҵ带 ȣ���� ������.
		MyUtil.userCar("msg", car);
	}
}
