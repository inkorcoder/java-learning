import java.util.BitSet;
import java.util.Vector;
import java.util.Stack;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Properties;

/*
	Non-Primitive data types
	it means that it's data types which is baced on primitives
	And you are able to do some things with it, because
	the language gives you a lot of methods

	IMPORTANT!!!! To understand how it works - you need to
	know how classes works and how we can create instances
	For non-primitive types there is a rule, that we need to
	write type which is a constructor class name is:
*/

class dataTypes {
	public static void main (String args[]){

		// string literal, it is a sequence of charackters
		// "String" is a constructor
		String stringVariable = "Long string can be here...";
		// the most basic rhing we can do - is to find the length
		// length can't be a float number, and cant't be boolean
		// so we need to define length as a integer
		// but in case of very large strings, maybe we need to define it
		// as a "long" type
		int stringVariableLength = stringVariable.length();
		System.out.println("\n\rstring: " + stringVariable + " and it length: " + stringVariableLength);
		// or we can take a specific symbol (char) at the position
		// IMPORTANT!!! numeration in programming begins from zero, not from one
		// so 0 - is the first one, 1 - is the second one
		char stringVariableFirstChar = stringVariable.charAt(0); // 1st
		System.out.println("string first char is (" + stringVariableFirstChar + ")");
		char stringVariableFourthChar = stringVariable.charAt(3); // 4th
		System.out.println("string first char is (" + stringVariableFourthChar + ")");
		// and there are so many methods with strings, you need to check it
		// (https://www.tutorialspoint.com/java/java_strings.htm)[String methods]

		// array, it is a sequence of primitives or non-primitive types
		// if we add cquare brackets to "String" we create an array
		// of strings. Each element in array has a specific index,
		// it is a number, starts from 0 (in most cases)
		String[] fruitsArray = {"apple", "banana", "mango"};
		// the first and a basic what you can do - is a find specific element
		// is is much easier than in strings, we don't need to call method for it
		// just symply index in cquare bracets
		System.out.println(fruitsArray[0]);
		// (https://www.tutorialspoint.com/java/java_arrays.htm)[Arrays]

		// Enumeration
		// enum week {SUNDAY, MONDAY, TUESDAY, THIRSDAY, FRIDAY, SATURDAY};
		// This data type is very old, it is something like array, but
		// it is not an array. It has only two methods:
		// .nextElement() and .hasMoreElements()
		// we can't defin it here, because of error like: "types must not be local"
		// we need to declare it at he beginning of class or in different way

		// BitSet
		// It is a special type of array for holing integers
		// this numbers will be known as bits
		BitSet bits1 = new BitSet();
		// we can add new bit with value of:
		bits1.set(1);
		bits1.set(2);
		bits1.set(3);
		bits1.set(4);
		System.out.println("\n\rBitSet one is: " + bits1 + " and it's length is " + bits1.length());
		// let's create another bitset
		BitSet bits2 = new BitSet();
		bits2.set(3);
		bits2.set(4);
		bits2.set(5);
		bits2.set(6);
		System.out.println("BitSet two is: " + bits2 + " and it's length is " + bits2.length());
		// we can find which bits are equals each other in this two sets
		// the result will be placed to bits2 object, because we call method on it
		bits2.and(bits1);
		System.out.println("BitSet AND is: " + bits2);
		// or, which is different
		bits2.or(bits1);
		System.out.println("BitSet OR is: " + bits2);
		// we can remove bit by index, thi index starts from 1, not from 0
		bits2.clear(1);
		System.out.println("BitSet clear 1st is: " + bits2);
		// or we can clear the range of indexes by pasting FROM and TO indexes
		bits2.clear(2,4);
		System.out.println("BitSet clear from 2nd to 4th is: " + bits2);
		// IMPORTANT!!!!
		// in console we can see that our bitset becomes shorter. It is not true.
		// in reality if we create bitset from 5 bits then we have length of 5
		// method .clear() actualy not remove bits, it's just set it to false
		// and this bit will not be displayed in System.out.print()
		// to get it back, we need to set bit to true
		bits2.set(1,true);
		bits2.set(2,true);
		bits2.set(3,true);
		System.out.println("BitSet getted back from 1st to 3d is: " + bits2);
		// (https://www.tutorialspoint.com/java/java_bitset_class.htm)[BitSet]

		// Vector
		// it is an array, but we need it if the size of array will be changed over the time
		Vector vector1 = new Vector();
		// for adding new elements we need to call .add() or .addElement()
		vector1.add(new Integer(2));
		vector1.addElement(new Integer(3));
		vector1.add(new Integer(4));
		System.out.println("\n\rThe vector1 is: " + vector1);
		Vector vector2 = new Vector();
		vector2.add(new Integer(5));
		vector2.add(new Integer(6));
		vector2.add(new Integer(7));
		System.out.println("The vector2 is: " + vector2);
		// we can add one vector at the end of another vector
		vector2.addAll(vector1);
		System.out.println("The vector2 is: " + vector2);
		// we can check if vector contains specific value
		System.out.println("Is vector2 contains 4: " + vector2.contains(4));
		System.out.println("Is vector2 contains 44: " + vector2.contains(44));
		// (https://www.tutorialspoint.com/java/java_vector_class.htm)[Vector]

		// Stack (LIFO)
		// It is an array, but it works in different way:
		// you cannot add elements inside, or add it with custom index
		// LIFO - (Last In First Out) it's like a building:
		// you can place one block on another and build your house
		// but if you need to remove your building - you need to do it
		// block by block from top to bottom
		// it means that if you need to add new elements - it will be appended
		// to the end, and if you need to remove it - it also will be removed
		// from the end, if you have an elements in stack
		// IMPORTANT!!! It's inherited from Vector class, so it contains
		// all methods from it, and few methods for it
		Stack stack = new Stack();
		// let's push an elements
		stack.push(new Double(1.21));
		stack.push(new Integer(21));
		stack.push(new Double(1412.0));
		stack.push(new Integer(3));
		// and you can see, that the last element appends to the end of the stack
		System.out.println("\n\rThe stack is: " + stack + " last in the end");
		// let's remove element. Again, LIFO (Last In First Out), last element will be removed
		stack.pop();
		// and you can see, that the larst element was removed
		System.out.println("\n\rThe stack is: " + stack + " last was removed");
		// we know, that Stack class is inherited from Vector class, so we can use
		// Vector's methods, for example .elementAt(), which takes an index and
		// returns element with this index
		System.out.println("The second element is: " + stack.elementAt(1)); // 0, 1, 2...

		// Dictionary
		// It is a storage repository for storing something and it represents as a key / value object
		// It works like localStorage in JavaScript (i think so)
		// You can put values, get values and remove values
		// Dictionary is an abstract class, this means that you cannot call it and create
		// new dictionary in way something like this:
		// Dictionary dictionary = new Dictionary();
		// instead, we need to use Map and generic Lists to create it
		// It will be further.
		// (https://www.tutorialspoint.com/java/java_dictionary_class.htm)[Dictionary]

		// Hashtable
		// It is actually implementing of Dictionary
		// Here you can create hashtable:
		// we remember, that hashtable was created from dictionary, which is created
		// from Map interface. So we have a lot of methods
		Hashtable hashtable = new Hashtable();
		// add new keys
		hashtable.put("name", "John");
		hashtable.put("age", 24);
		System.out.println("hashtable is: " + hashtable);
		// we can check if our key is in table
		System.out.println("is name in hashtable? " + hashtable.containsKey("name"));

		// Properties
		// It is a subclass of Hashtable, but it is only for storing keys as strings
		// and values also as a strings
		// but here you can set the default properties
		Properties props = new Properties();
		props.put("name", "Margarete");
		System.out.println("Properties is: " + props);
	}
}