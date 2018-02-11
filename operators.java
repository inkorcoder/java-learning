class operators {

	public static void main (String args[]){

		// integer variables
		int dogs = 11,
				cats = 2;

		// float variables, we need to write suffix "f"
		float planetWeight = 1.4f,
					sunWeight = 1213.23f;

		// binary variables
		int bin1 = 0b0100,
				bin2 = 0b0001;

		/*
			Arithmetic Operators
		*/
		System.out.println("\n\r     Arithmetic Operators\n\r--------------------------");
		// add
		System.out.println("[+]  sum "+dogs+" and "+cats+" is: " + (dogs + cats));
		// substract
		System.out.println("[-]  difference between "+dogs+" and "+cats+" is: " + (dogs - cats));
		// multiplying
		System.out.println("[*]  sum "+dogs+" times "+cats+" is: " + (dogs * cats));
		// dividing
		System.out.println("[/]  "+dogs+" divide by "+cats+" is: " + (dogs / cats));
		// modulus
		// by default java divides without reminder, so we can find it
		System.out.println("[%]  module from dividing "+dogs+" by "+cats+" is: " + (dogs % cats) + " ("+(dogs / cats)+" * "+cats+" + "+(dogs % cats)+")");
		// increment (add 1)
		System.out.println("[++] increment of "+dogs+" is: " + (++dogs));
		// decrement (substract 1)
		System.out.println("[++] decrement of "+cats+" is: " + (--cats));

		dogs--;
		cats++;

		/*
			Relational Operators
			the result returns boolean type, [true] or [false]
		*/
		System.out.println("\n\r     Relational Operators\n\r--------------------------");
		// equals
		System.out.println("[==] is "+dogs+" equals "+cats+"? " + (dogs == cats));
		// not equals
		System.out.println("[!=] is "+dogs+" not equals "+cats+"? " + (dogs != cats));
		// greater than
		System.out.println("[>]  is "+dogs+" greater than "+cats+"? " + (dogs > cats));
		// less than
		System.out.println("[<]  is "+dogs+" less than "+cats+"? " + (dogs < cats));
		// greater than or equal to
		System.out.println("[>=] is "+dogs+" greater than or equal to "+cats+"? " + (dogs >= cats) + ", and "+cats+" >= "+cats+" "+(cats >= cats));
		// less than or equal to
		System.out.println("[<=] is "+dogs+" less than or equal to "+cats+"? " + (dogs <= cats) + ", and "+cats+" <= "+cats+" "+(cats <= cats));

		/*
			Bitwise Operators
			in this case number will be converted to binary number and operator
			works with bits of this number. For example:
				1[dec] 	= 0001[bin]
				5[dec] 	= 0101[bin]
				10[dec] = 1010[bin]
			Operator takes two numbers and watch each pare of bytes and compare it.
			Starting from right side. Example:
				000[1], 00[0]1, 0[0]01, [0]001
				101[0], 10[1]0, 1[0]10, [1]010
			And returns new binary number. That's why you probably can be surprised
			by "strange" results
		*/
		System.out.println("\n\r     Binary Operators");
		System.out.println("     further "+dogs+" is 1100, "+cats+" is 0010\n\r--------------------------");
		// binary "AND" (12 & 2)
		// if both of operands equals 1 then returns 1, otherwise - 0
		System.out.println("[a&b]");
		System.out.println("       [1]011 1[0]11 10[1]1 101[1]");
		System.out.println("       [0]010 0[0]10 00[1]0 001[0]");
		System.out.println("       [0]     [0]     [1]     [0] => " + (dogs & cats));
		// binary "OR" (12 | 2)
		// if one operand or second, or both equals 1 then returns 1, otherwise - 0
		System.out.println("[a|b]");
		System.out.println("       [1]011 1[0]11 10[1]1 101[1]");
		System.out.println("       [0]010 0[0]10 00[1]0 001[0]");
		System.out.println("       [1]     [0]     [1]     [1] => " + (dogs | cats));
		// binary "XOR" (12 ^ 2)
		// if one operand or second, but not both equals 1 then returns 1, otherwise - 0
		System.out.println("[a^b]");
		System.out.println("       [1]011 1[0]11 10[1]1 101[1]");
		System.out.println("       [0]010 0[0]10 00[1]0 001[0]");
		System.out.println("       [1]     [0]     [0]     [1] => " + (dogs ^ cats));
		// binary "NOT" (~12)
		// operatir just replace bits by opposite value, 1 replace by 0, 0 replace by 1
		System.out.println("[~a]");
		System.out.println("       [1]011 1[0]11 10[1]1 101[1]");
		System.out.println("       [1]     [1]     [0]     [0] => " + (~dogs) + "\n\r       clearly it is 12, but if first byte of 32-bit number\n\r       is 1 then it interpolates as negative one");
		// binary "LEFT SHIFT" (12 << 2)
		// operator moves first number left by number of bits which is second number
		// 12 moves by 2 bits left
		System.out.println("[a << b]");
		System.out.println("       [1]011   1[0]11   10[1]1   101[1]");
		System.out.println("       [1]01100 1[0]1100 10[1]100 101[1]00 1011[0]0 10110[0]");
		System.out.println("       [1]       [0]       [1]       [1]       [0]       [0]=> " + (dogs << cats));
		// binary "RIGHT SHIFT" (12 >> 2)
		// operator moves first number left by number of bits which is second number
		// 12 moves by 2 bits left
		System.out.println("[a >> b]");
		System.out.println("       [0]01011 0[0]1011  [1]011 1[0]11 10[x]1 101[x]");
		System.out.println("       [0]01011 0[0]1011  [1]011 0[0]11");
		System.out.println("       [0]       [0]      [0]     [0] => " + (dogs >> cats));
		// binary "ZERO FILL RIGHT SHIFT" (12 >> 2)
		// operator moves first number left by number of bits which is second number
		// 12 moves by 2 bits left and creates 0 in old bits
		System.out.println("[a >>> b]");
		System.out.println("       [0]01011 0[0]1011  [1]011 1[0]11 10[x]1 101[x]");
		System.out.println("       [0]01011 0[0]1011  [1]011 0[0]11");
		System.out.println("       [0]       [0]      [0]     [0] => " + (dogs >>> cats));
		// in this case our number is short, so we can't see how bits moves right,
		// we already have zero in each bit left, that's why we can't see difference
		// between right shift and shift with zero filling

		/*
			Logical Operators
			the result returns boolean type, [true] or [false]
		*/
		System.out.println("\n\r     Logical Operators\n\r--------------------------");
		// AND - if both of operands returns true - then operator returns true, otherwise - false
		System.out.println("[&&] is dogs equals "+dogs+" and cats equals "+cats+"? " + (dogs == 11 && cats == 2));
		// OR - if one of operands returns true - then operator returns true, otherwise - false
		System.out.println("[||] is dogs equals "+dogs+" and cats equals "+(cats-1)+"? " + (dogs == 11 || cats == 1));
		// NOT - change result by opposite value, true to false, false to true, and return new value
		// by default dogs is equals to 12, and "AND" operator return true, it's obviously
		// but we change value to opposite and take an opposite, which is false
		System.out.println("[!]  is dogs not equals "+dogs+" " + !(dogs == 11));

		/*
			Assigning Operators
			assign to variable old value + new value, simply just appends to a variable
		*/
		System.out.println("\n\r     Assigning Operators\n\r--------------------------");
		// assign new value and remove old value
		System.out.println("[=]  dogs = " + (dogs = 10));
		// add and append new value
		System.out.println("[+=] add 2 dogs = " + (dogs += 2));
		// substract and append new value
		System.out.println("[-=] substract 2 dogs = " + (dogs -= 2));
		// multiply and append new value
		System.out.println("[*=] multiply dogs by 2 = " + (dogs *= 2));
		// divide and append new value
		System.out.println("[/=] divide dogs by 2 = " + (dogs /= 2));
		// find module and write (not append!!!) new value
		System.out.println("[%=] find moudle dogs by 3 = " + (dogs %= 3) + "10 % 3 = 1 (10 - 3 * 3 = 1)");

		// also, java has other operators, but is uses not very often, so it's not so important for now
		// https://www.tutorialspoint.com/java/java_basic_operators.htm

		/*
			Miscellaneous Operator
			if expression returns true, then we're doing "true" action, otherwise - "false" action
		*/
		System.out.println("\n\r     Miscellaneous Operator\n\r--------------------------");
		System.out.println("[(exp) ? true : false]");
		// we have dogs = 10 previously, but after dogs %= 3 we have 1 in this variable
		// so, 1 is less than 2, operator returns false, and we're going to skip "grater" and write "smaller"
		System.out.println("The number of dogs is " + (dogs > cats ? "greater" : "smaller") + " than cats");

	}
}