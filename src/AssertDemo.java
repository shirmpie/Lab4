/* 
 * CSS 162 Assert Demo
 * 
 * Usage: This software is configured to crash your program immediately upon execution.
 * If your software doesn't crash, you don't have assertions enabled (use "-ea")
 * in your editor.  Google the name of your editor and "how to enable asserts" or follow
 * the instructions specific to BlueJ or Eclipse in the lab.
 * 
 * Author: Rob Nash
 */

import java.awt.*;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class AssertDemo {

	/* Work on this in a piecewise fashion by uncommenting and focusing on one section at a time
	 * in isolation rather than running everything at once.
	 */
	public static void main(String[] args) {
		assert(true);
		//assert(false);
		
		//warmUpAsserts();
		
		//assertWithPrimitives();
		
		assertWithObjects();
		
		//homeworkRelatedAsserts();
	}

	/*
	 * Just a few warm-up asserts here.
	 * Add two new assert() statements after the TODO below
	 */
	private static void warmUpAsserts() {	
			assert( 5 > 1 );
			
			int a = 30;
			assert(a != 0);
	
			assert(null == null);	  //could this ever be false? nope
			assert(true == true);	  //a bad day indeed if this could be false

			assert (false == false);
			assert (8 < 15);
	}

	/*
	 * Using asserts in conjunction with primitive types is familiar to you;
	 * just as in a loop or if, you want to form a true/false (boolean) expression
	 * by employing the relational operators.
	 */
	private static void assertWithPrimitives() {
		//assert below to ensure a Fraction's denominator is never 0
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer numerator:");
		int num = keys.nextInt();
				
		System.out.println("Enter an int denominator, not 0:");
		int denom = keys.nextInt();
				
		assert(denom != 0);
	
		//assert that all ArrayLists start empty
		ArrayList<String> emptyList = new ArrayList<String>();
		assert(emptyList.size() == 0);
		//TODO: build two more asserts that use primitives and relational operators here

		int x = 4;
		assert(x>=0);

		int y = 7;
		assert (y == 10);



	}
	
	/*
	 * Asserts work with both primitives and objects.  Just as you 
	 * use "==" with primitives and ".equals()" with objects, so too 
	 * will you use ".equals()" in asserts that deal with object equality. 
	 */
	private static void assertWithObjects() {
		AssertDemo ad = new AssertDemo();
		ad.checkAddress(ad);		
		//guess what .equals() does if you don't create one yourself? (hint ==)
		assert( ad.equals(ad) );  
		//TODO: make a few objects from any previous lab and test them with assert
		//example: make two Point objects at the origin and assert they are equal

		Point p1 = new Point(5, 9);
		Point p2 = new Point(5, 9);
		assert(p2.equals(p1));  //example

		Box[] array = new Box[2];
		array[0] = new Box(4, 5, 3, 2);
		array[1] = new Box(4, 5, 3, 2);
		assert(array[0].equals(array[1]));
	}
	/*To what address does “this” map to?
	'this' maps to the current instance of the 'AssertDemo' class

		To what address does “input” or “ad“ map to?
	The address to which 'input' or 'ad' map to will depend
	on the object that is passed as an argument to the checkAddress method,
	in this case the address of this.
	* */


	/*
	 * This function compares the address at "this" to the address of the object handed 
	 * into the function.
	 */
	public void checkAddress(Object input) {
		System.out.println("Address of this :" + this);
		System.out.println("Address of input:" + input);
		//how many aliases for the one "new" object created in main exist in this scope? 
		//1? 2? 3? Which are they?
		assert(this == input);  //== does an address check for objects, which is frequently NOT what we want
	}

	/*	
	 * Asserts are a useful tool for transforming postconditions and class invariants into code.
	 * Lets build a few asserts that work with your current Bill & Money assignment.
	 * Change the value of paidDate and cents to trip the asserts and observe the asserted error message. 
	 */
	private static void homeworkRelatedAsserts() {
		Object paidDate = new Object();  //really, a Date 
		assert( paidDate != null);  	 //perhaps one rule is that paidDate shouldn't be null after calling setPaidDate()
		int cents = 0;
		assert( cents >= 0 && cents <=99);  //another class invariant is written as an assert here.
		//TODO: craft 2 more asserts that you could use with any assignment


		Book hi = new Book();
		Book bye = new Book();
		assert (hi.equals(bye));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word1 = scan.nextLine();

		System.out.println("Enter another word:");
		String word2 = scan.nextLine();

		assert(word1.equals(word2));
		/*To test immutable objects, we can write test cases
		that verify that the object's state is correctly initialized
		in the constructor and that the object's methods return the
		expected values. Since immutable objects do not have any setters
		or mutators, there is no need to test methods that modify their state.
		Testing immutable objects is similar to testing primitives
		in that once they are created, their state cannot be changed. Reference: ChatGPT

		Which technique do you prefer? Why?
			I prefer using a GUI because i like seeing what the code is doing at a certain step
		Are some debugging techniques more (or less) appropriate for longer programs?
			Using flags and assertions seems more suitable for longer programs
		What are the advantages to using a debugger with a GUI?
		What can you inspect here that you couldn’t when just printing to the console?
			With a GUI debugger, you can inspect variables in real-time while the program is running.
			GUI debuggers also allow you to set breakpoints in your code
		How can proper documentation help in finding and avoiding bugs?
			Well-documented code is typically easier to read and understand.
			Documentation can reduce misunderstandings and communication errors that could lead to bugs.
		*/

	}
}
