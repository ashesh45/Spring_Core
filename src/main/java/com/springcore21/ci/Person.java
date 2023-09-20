package com.springcore21.ci;

public class Person {

	private String name;
	private int personId;
	
	
	public Person(String name, int PersonId)
	{
		this.name=name;
		this.personId=personId;
}


	@Override
	public String toString() {
		return this.name+" :"+this.personId;
	}
	
	
}
