package demo.java.generics.sample.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class CollectionDemo {
	
	static Person donPage = new Person("donPage",81);
	static Person peegyDal = new Person("peegyDal",64);
	
	//List can have duplicate, have order use get(index)
		public static void listSample() {	
			System.out.println("\n----------List Sample----------\n");
			
			List<String> simpleList = new ArrayList<>();
			simpleList.add("ZZ");
			simpleList.add("KZ");
			simpleList.add("BZ");
			simpleList.add("QZ");
			//-- no need to implement comperator for simple object
			//Collections.sort(simpleList, Collections.reverseOrder());
			//Collections.sort(simpleList);
			//System.out.println(simpleList);
			
			
			
			//not using type in right side introduce in java 7 so it just take from left side of object
			List<Person> madMen = new ArrayList<>();
			madMen.add(peegyDal);
			madMen.add(donPage);
			madMen.add(peegyDal);
			madMen.add(peegyDal);				
			 
			//return true if present
			System.out.println(madMen.contains(donPage));
			System.out.println(madMen);
			
			// order ascending
			Collections.sort(madMen, new  PersonNameComparator());
			// order descending
			//Collections.sort(madMen, Collections.reverseOrder(new personAgeComperator()));
			
			// comparator with anonymous class [its better if you need comparator in just one place]
			Collections.sort(madMen, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			
			//iterator are in order in which we add elements
//			final Iterator<Person> iterator = madMen.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());			
//			}
						
			//better to use for each 
			for(Person person : madMen) {
				System.out.println(person);
			}	
			System.out.println("Min age persone : " + minGeneric(madMen,new personAgeComparator()));
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

		public static void genericClassTypeBound() {
			SortPair<Float> sortNumber= new SortPair<>(2.1f,1.1f);
			System.out.println(sortNumber);
		}

		//Generic method
		public static <T> T  minGeneric(List<T> madMan, Comparator <T> comparator) {
			
			return Collections.min(madMan, comparator);
			
		}
		
		//method referencing
		public static void sampleMethodReferencing() {
			List<Integer> names= Arrays.asList(1,3,2);
			System.out.println("Min number with method reference : " + minGeneric(names, Integer::compare));
			
		}
}
