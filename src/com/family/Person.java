package com.family;
import java.util.ArrayList;


public class Person {

//	static enum sex{MALE,FEMALE};
	
	String name,sex;
	public String getSex() {
		return sex;
	}


	Person father,mother;
	Person spouse;
	public Person getSpouse() {
		return spouse;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}


	ArrayList<Person> children;
	
	
	Person(String name,String sex)
	{
		this.name=name;
		this.sex=sex;
		children = new ArrayList<Person>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public ArrayList<Person> getChildren() {
		return children;
	}
	public void setChildren(Person child) {
		if(!children.contains(child))
			children.add(child);
	}

	
	public Boolean haschildren()
	{
		
		if(getChildren().size()>0)
			return true;
		else
			return false;
	}
	public Boolean hasspouse()
	{
		
		if(spouse != null)
			return true;
		else
			return false;
	}
	public Boolean hasfather()
	{
		
		if(father != null)
			return true;
		else
			return false;
	}
	public Boolean hasmother()
	{
		
		if(mother != null)
			return true;
		else
			return false;
	}
	
	
	
}
