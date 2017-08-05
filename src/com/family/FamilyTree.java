package com.family;
import java.util.ArrayList;


public class FamilyTree {

	/**
	 * @param args
	 */
	public void displayfamilytree(ArrayList<Person> family)
	{
		
		for(Person p : family)
		{
			
			String wife =p.hasspouse()== true?p.getSpouse().getName():"Not married";
			System.out.println("\n name" +p.getName() +"spouse name" + wife);
			if(p.haschildren()){
			for(Person p1 : p.getChildren())
				System.out.println("\nchild name "+p1.getName());
			}
			
		}
	}

}
