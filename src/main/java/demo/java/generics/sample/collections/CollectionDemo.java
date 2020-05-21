package demo.java.generics.sample.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class CollectionDemo {
	
	static Person donPage = new Person("donPage",81);
	static Person peegyDal = new Person("peegyDal",64);
	
	//List can have duplicate, have order use get(index)
		public static void listSample() {	
			System.out.println("\n----------List Sample----------\n");
			
			//not using type in right side introduce in java 7 so it just take from left side of object
			List<Person> madMen = new ArrayList<>();
			madMen.add(donPage);
			madMen.add(peegyDal);
			
			//return true if present
			System.out.println(madMen.contains(donPage));
			
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
		
		//Set have only unique element, don't have order so not get(index)
		public static void setSample() {
			System.out.println("\n----------Set Sample----------\n");
			Set<Person> madMenSet = new HashSet<>();
			madMenSet.add(donPage);
			madMenSet.add(donPage);
			madMenSet.add(peegyDal);
			madMenSet.add(new Person("peegyDal",64));
			//return true if present
			System.out.println(madMenSet.contains(donPage));
			for (Person person : madMenSet) {
				System.out.println(person);
			}
			
		}

		//Map have <key, value>, key should be unique but one value can be associate to many keys
		public static void mapSample() {
			System.out.println("\n----------Map Sample----------\n");
			
			Map<String, Person> madMenMap = new HashMap();
			
			madMenMap.put(donPage.getName(), donPage);
			madMenMap.put(donPage.getName(), donPage);
			madMenMap.put(peegyDal.getName(), peegyDal);
			
			//get keys
			for (String key : madMenMap.keySet()){
				System.out.println(key);
			}
			//get value		
			for (Person person : madMenMap.values()){
				System.out.println(person);
			}
			//get both
			for (Map.Entry<String, Person> entry : madMenMap.entrySet()){
				System.out.println(entry);
			}
			
			
		
		}

}
