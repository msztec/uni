package com.ptc.training.mvc.facade;

import com.ptc.training.mvc.domain.Address;
import com.ptc.training.mvc.domain.Car;
import com.ptc.training.mvc.domain.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonFacadeImpl implements PersonFacade {

	private List<Person> persons;
	private List<Car> cars;
	private Map<Person, List<Car>> mapOfCars;
	
	public PersonFacadeImpl() {
		persons = new ArrayList<Person>();
		cars = new ArrayList<Car>();
		mapOfCars = new HashMap<Person, List<Car>>();
		
		persons.add(new Person("John", "Doe", 21, new Address("Lodz", "Fabryczna 17", "90-350")));
		persons.add(new Person("Caroline", "Forbes", 21, new Address("Chicago", "21th Street 1242", "12-324")));
		
		cars.add(new Car("Toyota", "Corolla", 1998));
		cars.add(new Car("Audi", "Q7", 2013));
		cars.add(new Car("Skoda", "Fabia", 2005));
	}
	
	public Person createPerson(Person person) {
		persons.add(person);
		mapOfCars.put(person, new ArrayList<Car>());
		return person;
	}

	public List<Person> listPersons() {
		return persons;
	}

	public Car createCar(Car car) {
		cars.add(car);
		return car;
	}

	public List<Car> listCars() {
		return cars;
	}

	public boolean assignCarToPerson(Car car, Person person) {
		if (mapOfCars.containsKey(person)) {
			mapOfCars.get(person).add(car);
			return true;
		}
		return false;
	}

	public List<Car> listCarsOfPerson(Person person) {
		if (mapOfCars.containsKey(person)) {;
			return mapOfCars.get(person);
		}
		return null;
	}

}
