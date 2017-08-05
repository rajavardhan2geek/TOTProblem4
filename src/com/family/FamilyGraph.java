
package com.family;
import java.util.ArrayList;


public class FamilyGraph {
	
	ArrayList<Person> family;
	Person member;
	int numOfMemb;
	String surname;
	public ArrayList<Person> getFamily() {
		return family;
	}

	public void setFamily(ArrayList<Person> family) {
		this.family = family;
		this.numOfMemb =family.size();
	}

	public int getNumOfMemb() {
		return numOfMemb;
	}

	public void setNumOfMemb(int numOfMemb) {
		this.numOfMemb = numOfMemb;
	}

	public FamilyGraph()
	{
		this.family = new ArrayList<Person>();
		this.numOfMemb =0;
	}
	public FamilyGraph(int numOfMemb)
	{
		this.family = new ArrayList<Person>();
		this.numOfMemb =numOfMemb;
	}
	public FamilyGraph(int numOfMemb,ArrayList<Person> family)
	{
		this.family = family;
		this.numOfMemb = numOfMemb;
	}
	public void addMember(Person p)
	{
		family.add(p);
		numOfMemb++;
	}
   public Person getPerson(String name)
   {
	   Person person = null;
	   for(Person p:family)
	   {
		   if(p.getName().equalsIgnoreCase(name))
			   person= p;
	   }
	return person;
	   
   }
   
  public ArrayList<Person> GetBrothersSisters(Person p ,String relationname)
  {
	  ArrayList<Person> brothers = new ArrayList<Person>();
	  ArrayList<Person> sisters = new ArrayList<Person>();
	 ArrayList<Person> sibilings;
		  if(p.hasfather())
		  {
			  	Person father = p.getFather();
			  	if(father.haschildren())
			  	{
			  		for(Person temp: father.getChildren())
			  		{
			  			
			  			if(temp.getSex().equalsIgnoreCase("male"))
			  				brothers.add(temp);
			  			
			  			if(temp.getSex().equalsIgnoreCase("female"))
			  				sisters.add(temp);
			  			  
			  		 }
			  	}
			  if(relationname.equalsIgnoreCase("brothers"))
			  			 return brothers;
			  else if(relationname.equalsIgnoreCase("sisters"))
			  			return sisters;
			  else
				  
			  {
				  sibilings = new ArrayList<Person>();
				  sibilings.addAll(brothers);
				  sibilings.addAll(sisters);
				  return sibilings;
			  }
			  	
			  
		  }
		  else
			  return null;
	  
  }
}
