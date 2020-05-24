Java Fundamentals: Generics

why generics needs
-solve casting problem if we don't know what is the datatype.
-In collection that can contain any kind of object.
-stop runtime error at complie time
-helps in type safty
-also give the complie error before running(runtime)
-reduce boiler plate code (circular buffer example)

-----------Course outline-----------------
Main use for generics in java in collection
Generics class/Interface
Generics Methods
Wildcard generics
Rawtype & compatablity
Reflection $ lamdas with generics

1-Main use for generics in java in collection
while working with arrys first issue is we don't have easy tostring method to display.
	use (Arrays.toString(arry))
Can not add new object in array after it create use other way which is boiler code.
Cannot predefine metod to search element like conatin methods

2-Generics class/Interface
Three pattarn to implement generic type
-Implement a Generic Type : class that implement specific type parameter
eg : Comparator interface with argument of any type (here Person in code)
Comparator, Sort, anonymous with comparator
	
	Sample :	public class personAgeComparator implements Comparator<Person> {..

-Pass Up a Type Parameter : class implement generic interface both have same type parameter
pass the age comparator in to generic class argument eg revers comparator

	Sample :	public Class Reverser<T> implement Comparator<t>{..
	we are passing parameter from method calling to interface (down to up)
	Collections.sort(madMen, Collections.reverseOrder(new personAgeComperator()));
	
-Type Bounds : using extend key-word with generic type in class
Bound the generic class to accept the certain type of object not all.
	Sample :	Class MyGeneric<T extend Number> {...  => this will only allow numver datatypes like int, float, double not string or anyother

3-Generics Methods
.:.Read about Method referencing -> its callling method of class by ::


4-Wildcard generics <?>
Wildcars are bounded or unBounded, not use in generic class, use in parameter 

Upper Bounded :		Listx<? extend Person>
Accept any thing that is or extend/child Person class

Lower Bounded :		List <? super Cls>
Accept any thing that is or parent Person class

Unbounded 	  :		List  <?>
Use to hold any class in it with java reflextion.

5-Rawtype & compatablity






















