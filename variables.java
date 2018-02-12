class variables {
	public static void main (String args[]){

		/*
			Primitive data types
			it means that it's the most basic types.
			They have not any methods or properties to work with them
			You can only do the basic operations with it,
			like adding, substracting, multiplying and so on.
		*/
		// byte [8 bit] | 2^8 = 256
		// from -128 to 127
		byte byteVariable = -128;

		// short [16 bit] | 2^16 = 65536
		// from -32768 to 32767
		short shortVariable = 31234;

		// byte [32 bit] | 2^32 = 4294967296
		// from -4294967296 to 4294967295
		// also you can separate groups by underscore
		// 429496729 => 429_496_729
		int intVariable = 429_496_729;

		// byte [64 bit] | 2^64 = 18446744073709552000
		// in real life we need to enable 64-bit mode, because
		// by default java runs in 32-bit mode and can't handle
		// too long numbers like this
		// also, you can assign hex:
		long longVariable = 0xffff;

		// float [32 bit]
		// you need to add 'f' suffix after digits
		float floatPointVariable = 4294967296.5f;

		// double [64 bit]
		// you don't need to add 'f' suffix after digits
		double doublePointVariable = 4294967296.5;

		// boolean [true | false]
		boolean trueOrFalseVariable = true;

		// char [16 bit] | unicode char (1 symbol)
		char charVariable = '\u0000';

		// print all
		System.out.println("byte (8 bit): " + byteVariable);
		System.out.println("short (16 bit): " + shortVariable);
		System.out.println("int (32 bit): " + intVariable);
		System.out.println("long (64 bit): " + longVariable);

		System.out.println("float (32 bit): " + floatPointVariable);
		System.out.println("double (64 bit): " + doublePointVariable);

		System.out.println("boolean (64 bit): " + trueOrFalseVariable);

		System.out.println("char (16 bit): " + charVariable);

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
		// string literal, it is a sequence of charackters
		// "String" is a constructor
		String stringVariable = "Long string can be here...";
		// the most basic rhing we can do - is to find the length
		// length can't be a float number, and cant't be boolean
		// so we need to define length as a integer
		// but in case of very large strings, maybe we need to define it
		// as a "long" type
		int stringVariableLength = stringVariable.length();
		System.out.println("string: " + stringVariable + " and it length: " + stringVariableLength);
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

		

	}
}