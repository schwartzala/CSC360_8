package functional;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class LambdaTester {

	public static void main(String[] args) {


/** Create a Collection of Persons (ArrayList) for experimenting with streams and lambda expressions
 *  Each method houses a different experiment.
 *  To execute a experiment method, remove call comments 		
 */

		
		Person roland = new Person(703, "Roland", "DePratti", "06/18/1953", "860-111-1111", "860-111-1111");
		Person steven = new Person(421, "Steven", "DePratti", "12/15/1954", "860-111-1111", "860-111-1111");
		Person mike = new Person(003, "Michael", "DePratti", "04/10/1960", "860-111-1111", "860-111-1111");
		Person david = new Person(723, "David", "DePratti", "06/18/1953", "860-111-1111", "860-111-1111");
		
		
		ArrayList<Person> team = new ArrayList<Person>();
		team.add(roland);
		team.add(steven);
		team.add(mike);
		team.add(david);

		/** Each one of these calls executes a method that explores some of the capabilities of streams and 
		 *  functional programming.
		 *  There is a comment about the test followed by the method call.
		 *  Comment out method call to execute. 		
		*/
//		      Lab 8 Exercise 1
		        countDavids(team);
//		      Lab 8 Exercise 2
		        displayFirstNameofOLastNames(team);
//		      Wordcount on Shakespeare's Poems
			    processShakespearesPoems(args[0]);
			}

	/**  Count all People with Roland as a first name
	 */
	public static void countDavids(ArrayList<Person> team){
		
		long dCount = 0;
		
		/* Put your solution here */
		
		System.out.println("David Count : " + dCount);	
		  
	}

	/**  Display First Names of O Last Names
	 */
	public static void displayFirstNameofOLastNames(ArrayList<Person> team){

		
	/*  put yuor code here       */
		
	}

 	/**
	*         Word Count in Shakepseares Poems
	*/
	public static void processShakespearesPoems(String fname){
		
    
        	
             Map<String, Long> wordsCount = null;;
               
	     try 
       		{ 
       			
           	   /* uncomment wordcount and add your code */
            	   
//            	wordsCount = 		       		  
		                            		  
       		}
       		catch (Exception e) {System.err.println("IO Error" + e.getMessage());}
       
              /*  add code below to print out all wordcount wordcount words with counts > 300  
               *  Do his by turning wordcount into a stream, sort it by value 
               *  then has a forEach */ 
 				
	}

		
		

}


