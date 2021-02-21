package javaM3HW;

import java.util.*;
//did not work until i added this
import java.util.Iterator;

public class M3W1HW2 {
	
	public static void main(String[] args) {
		
		
//Write a Java program to copy one array list into another	
		List<String> Flowers1 = new ArrayList<String>();
					Flowers1.add("Pinks");
					Flowers1.add("Hyacinth");
					Flowers1.add("Lavender");
					Flowers1.add("Day Lily");
		  System.out.println("Flowers1: " + Flowers1);
		List<String> Flowers2 = new ArrayList<String>();
					Flowers2.add("Cosmos");
					Flowers2.add("Sweet Pea");
					Flowers2.add("Gladiolus");
			 
		  System.out.println("Flowers2: " + Flowers2);
		  // Copy Flowers2 to Flowers1
		  Collections.copy(Flowers1, Flowers2);
		  
		  
		  System.out.println("Copy Flowers1 to Flowers2 After copy:");
		  System.out.println("Flowers1: " + Flowers1);
		  System.out.println("Flowers2: " + Flowers2);
		 
	//prints
		  //Before copy
		  //Flowers1: [Pinks, Hyacinth, Lavender, Day Lily]
		  //Flowers2: [Cosmos, Sweet Pea, Gladiolus]
		  //Copy Flowers1 to Flowers2 After copy:
		  //Flowers1: [Cosmos, Sweet Pea, Gladiolus, Day Lily]
		  //Flowers2: [Cosmos, Sweet Pea, Gladiolus]




//Write a Java program to extract a portion of a array list
		List<String> fish = new ArrayList<String>();
						fish.add("shark");
						fish.add("marlin");
						fish.add("snapper");
						fish.add("trout");
			
		System.out.println("Original list: " + fish);
		List<String> newFish = fish.subList(0, 2);
		System.out.println("List of first 2 elements: " + newFish);
		
		
		//prints 
			//Original list: [shark, marlin, snapper, trout]
		    //List of first 2 elements: [shark, marlin]
		
		

//Write a Java program of swap two elements in an array list
		ArrayList<String> snakes = new ArrayList<String>();
		        
				        snakes.add("Sea");
				        snakes.add("Rattle");
				        snakes.add("Boa");
				        snakes.add("Milk");
			        
		        
		        System.out.println("Before swaping " + snakes);
		        
		        Collections.swap(snakes, 2, 3); //added snake
		        
		        System.out.println("After swaping " + snakes);
		        
	        //prints
		        //Before swaping [Sea, Rattle, Boa, Milk]
		        //After swaping [Sea, Rattle, Milk, Boa]



//Write a Java program to test an array list is empty or not...Boolean
		        ArrayList myArrayList = new ArrayList();
				
		           if (myArrayList.isEmpty())
		            System.out.println("ArrayList empty");
	
		           else
		        	System.out.println("ArrayList not empty");
		           
		    //prints
		          //ArrayList empty
		           

//Write a Java program to replace the second element of a ArrayList with the specified element.
		           
		           List<String> phobia = new ArrayList<String>();
				           phobia.add("Xylophobia");
				           phobia.add("Triskaidekaphobia");
				           phobia.add("Oikophobia") ;
		           
		           System.out.println("List before add" + phobia);  //list index is 3
		            
		           //Add element at 0 index
		           phobia.add(1, "Sesquipedalophobia");
		            
		           System.out.println("List after add" + phobia);  //add second element at index 2 list size is 4
		           
		           //prints
		           	//List before add[Xylophobia, Triskaidekaphobia, Oikophobia]
		            //List after add[Xylophobia, Sesquipedalophobia, Triskaidekaphobia, Oikophobia]

		           
//Write a Java program to trim the capacity of an array list the current list size
		           ArrayList<String> city= new ArrayList<String>();
				           city.add("Milan");
				           city.add("Baku");
				           city.add("Cali");
			           
		           System.out.println("Original array list: " + city);
		           System.out.println("Trim to size");
		           city.trimToSize();
		           System.out.println(city);
		           
		           //Prints
		           //Original array list: [Milan, Baku, Cali]
		           //Trim to size
		           //[Milan, Baku, Cali]



 //Write a Java program to test a hash set is empty or not.
		           HashSet<String> candy = new HashSet<String>();
		           
				           candy.add("Nerds");
				           candy.add("Smarties");
				           candy.add("Picky");
			           
		           System.out.println(" Original HashSet " + candy);
		           
		           Boolean hashSetCheck = candy.isEmpty();
		           System.out.println("HashSet empty or no return boolean: " + hashSetCheck);
		           
		           //prints
		           //Original HashSet [Nerds, Picky, Smarties]
		           //HashSet empty or no return boolean: false


//Write a Java program to get the number of elements in a hash set
		           
		           HashSet<String> candy2 = new HashSet<String>();
		           
				           candy2.add("Nerds");
				           candy2.add("Smarties");
				           candy2.add("Picky");
		           
		           int numberOfHashSet = candy2.size();
		           System.out.println("number of Hashset " + numberOfHashSet);
		           
		           //prints
		           	//number of Hashset 3
		            
		           


//Write a Java program to iterate through all elements in a hash list.
		           HashSet<String> cocktails = new HashSet<String>();
		           
				           cocktails.add("Irish Coffee");
				           cocktails.add("Bloody Mary");
				           cocktails.add("Mojito");
				           cocktails.add("Alabama Slammer");
				           cocktails.add("White Russian");
		                 

		          //sets Iterator 
		            Iterator<String> Cocktails = cocktails.iterator();
		            
		          //Iterating the hashSet
		           while (Cocktails.hasNext()) {
		           System.out.println(Cocktails.next());       
		           }
		           
		           //prints 
			           	//White Russian
			            //Alabama Slammer
			            //Irish Coffee
			            //Bloody Mary
			            //Mojito


//Write a Java program to convert a hash set to an array.
		           HashSet<String> cartoon = new HashSet<String>();
		           			//origional hashSet
		                  cartoon.add("The Tick");
		                  cartoon.add("Tom and Jerry");
		                  cartoon.add("Pink Panther");
		                  cartoon.add("Scooby-Doo");
		                  cartoon.add("Pinky & The Brain");
		                  
		              System.out.println("HashSet " + cartoon);
		            
		              ArrayList<String> arr = new ArrayList<String>(cartoon);
		              
		              System.out.println("Converted from HashSet to ArrayList " + cartoon);
		              
		              //String[] new_array = new String[h_set.size()];
		              //cartoon.toArray(new_array);
		         
		              // Displaying Array elements
		              //System.out.println("Array elements: ");
		              //for(String element : new_array){
		              // System.out.println(element);
		              
		            //prints
		              //HashSet [The Tick, Tom and Jerry, Pink Panther, Scooby-Doo, Pinky & The Brain]
		              //Converted from HashSet to ArrayList [The Tick, Tom and Jerry, Pink Panther, Scooby-Doo, Pinky & The Brain]


//Write a Java program to compare two sets and retain elements which are same on both sets.

		              HashSet<String> planets = new HashSet<String>(); //hasSet planets first
		              
		              planets.add("Vulcan");
		              planets.add("Earth");
		              planets.add("Thundera");
		              planets.add("Krypton");
		                   System.out.println("Frist HashSet: " + planets);
		                   
		                   HashSet<String>planets2 = new HashSet<String>();
		                   
	                   planets2.add("Thundera");
	                   planets2.add("Gallifrey");
	                   planets2.add("Pandora");
	                   planets2.add("Vulcan");
		                   
		                   System.out.println("Second HashSet content: "+ planets2);
		                   planets.retainAll( planets2);
		                   System.out.println("HashSet content:");
		                   System.out.println(planets);
		
		                   //prints
		                   	//Frist HashSet: [Earth, Thundera, Vulcan, Krypton]
		                    //Second HashSet content: [Pandora, Thundera, Vulcan, Gallifrey]
		                		   //HashSet content:
		                		   //[Thundera, Vulcan]
		
	}
}