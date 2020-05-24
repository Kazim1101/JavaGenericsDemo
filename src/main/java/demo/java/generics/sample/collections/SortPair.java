package demo.java.generics.sample.collections;


//extend Number will bound SortPair to set datatype in Number(including int, double, float eg all who implement number)
public class SortPair<T  extends Number> implements Comparable<T>  {

	private T first;
	private T second;
	
	@SuppressWarnings("unchecked")
	public SortPair(T left, T right) {
		if(((Comparable<T>) left).compareTo(right) < 0)
		{
			this.setFirst(left);
			this.setSecond(right);
		}
		else {
				this.setFirst(right);
				this.setSecond(left);
		}
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "SortPair [first=" + first + ", second=" + second + "]";
	}


	
	

}
