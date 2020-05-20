package demo.java.generics.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import demo.java.generics.sample.collections.Person;

public class Generis_ {

	public static void main(String[] args) {
		
		Person donPage = new Person("donPage",81);
		Person peegyDal = new Person("peegyDal",64);
		//not using type in right side introduce in java 7 so it just take from left side of object
		List<Person> madMen = new ArrayList<>();
		madMen.add(donPage);
		madMen.add(peegyDal);
		
		System.out.println(madMen);
		//iterator are in order in which we add elements
		final Iterator<Person> iterator = madMen.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());			
		}
		//better to use for each 
		for(Person person : madMen) {
			System.out.println(person.getName());
		}		
		
	}

}
