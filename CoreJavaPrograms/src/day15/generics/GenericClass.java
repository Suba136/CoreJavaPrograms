package day15.generics;

public class GenericClass<T> {
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}

}
