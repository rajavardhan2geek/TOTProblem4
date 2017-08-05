package com.family;
import java.util.ArrayList;
import java.util.Scanner;


public class Set4Prob1 {

	/**
	 * @param args
	 * @return 
	 */
	
	
	
	public static FamilyGraph familyCreation()
	{
		FamilyGraph family = new FamilyGraph(5);
		Person p1  = new Person("raja", "male");
		Person p6  = new Person("sony", "female");
		Person p7  = new Person("rad", "female");
		Person p8  = new Person("xyz", "male");
		Person p2 = new Person("goverdhan","male");
		Person p3 = new Person("laxmi","female");
		Person p5 = new Person("shyamalamma","female");
		Person p4 = new Person("papi","male");
		p2.setSpouse(p3);
		p2.setFather(p4);
		p2.setMother(p5);
		p2.setChildren(p1);
		p1.setFather(p2);
		p1.setMother(p3);
		p3.setSpouse(p2);
		
		p6.setFather(p2);
		p6.setMother(p3);
		p2.setChildren(p6);
		p3.setChildren(p6);
		
		p7.setFather(p2);
		p7.setMother(p3);
		p2.setChildren(p7);
		p3.setChildren(p7);
		
		p8.setFather(p2);
		p8.setMother(p3);
		p2.setChildren(p8);
		p3.setChildren(p8);
		
		p4.setSpouse(p5);
		p4.setChildren(p2);
		p5.setSpouse(p4);
		p5.setChildren(p2);
		family.addMember(p1);
		family.addMember(p2);family.addMember(p3);family.addMember(p4);family.addMember(p5);
		
		family.addMember(p6);family.addMember(p7);family.addMember(p8);
		return family;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> brothers;
		FamilyGraph family =familyCreation();
		FamilyTree familytree = new FamilyTree();
		familytree.displayfamilytree(family.getFamily());
		System.out.println("Person =");
		Scanner scanner = new Scanner(System.in);
		String pname = scanner.nextLine();
		
		System.out.println("Relation =");
		String rname = scanner.nextLine();
		brothers = family.GetBrothersSisters(family.getPerson(pname), rname);
		familytree.displayfamilytree(brothers);
	}
		

}
