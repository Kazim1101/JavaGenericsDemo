package demo.java.generics.sample.collections;

import java.util.Comparator;

public class personAgeComparator implements Comparator<Person> {

	public personAgeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
