package com.ptc.training.mvc.facade;

import com.ptc.training.mvc.domain.Car;
import com.ptc.training.mvc.domain.Person;

import java.util.List;

public interface PersonFacade {

	Person createPerson(Person person);
	
	List<Person> listPersons();
	
	Car createCar(Car car);
	
	List<Car> listCars();
	
	boolean assignCarToPerson(Car car, Person person);
	
	List<Car> listCarsOfPerson(Person person);
	
}
