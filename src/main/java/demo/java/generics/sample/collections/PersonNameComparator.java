package demo.java.generics.sample.collections;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{

	public PersonNameComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
