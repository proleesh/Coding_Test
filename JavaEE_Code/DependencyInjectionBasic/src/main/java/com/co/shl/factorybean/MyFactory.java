package com.co.shl.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyFactory implements FactoryBean<Car>{

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand("BMW");
		car.setPrice(49000000.0);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

}
