package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolution {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Jeffrey", "Wei",25),
				new Person("David", "Tang",26),
				new Person("Casiy","Lee",22),
				new Person("Thomas","Carlyle",23),
				new Person("Matthew", "Arnold",33)
                    );
		
		//Step1: sort list for last name
		
		Collections.sort(people,new Comparator<Person>(){
			
			@Override
			public int compare(Person o1, Person o2)
			{
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//step 2: Create a method that prints all elements in the list
		printAll(people);

		// step 3:Create a method that prints all people that have last name beginning with C
		//printLastNameBeginningWith(people);
		printConditionally(people, new Condition() {
			
		@Override
		public boolean test(Person p)
		{
			return p.getLastName().startsWith("C");
		}
		});
		}
		
	
	

	  private static void printAll(List<Person> people)
	  {
		  for(Person p:people)
		  {
			  System.out.println(p);
		  }
	  }
	
	/*  private static void printLastNameBeginningWith(List<Person> people)
	  {
		  for(Person p: people)
		  {
			  if(p.getLastName().startsWith("C"))
				  System.out.println(p);
		  }
					 
	  }
	  
	  */
	  
	  
	  private static void printConditionally(List<Person>people, Condition condition )
	 {
	      for(Person p: people)
	      {
	    	  if(condition.test(p))
	    		  System.out.println("The last name begin with C is" + p );
	    	  
	      }
	  
	  }
	  
	
	  
	  
	  
}
   interface Condition
   {

		 boolean test(Person p);
   }