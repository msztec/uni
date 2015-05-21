package pl.com.tt.facade;

import pl.com.tt.domain.Car;
import pl.com.tt.domain.Person;

import java.util.List;



public interface PersonFacade {

	Person createPerson(Person person);
	
	List<Person> listPersons();
	
	Car createCar(Car car);
	
	List<Car> listCars();
	
	boolean assignCarToPerson(Car car, Person person);
	
	List<Car> listCarsOfPerson(Person person);
	
}
