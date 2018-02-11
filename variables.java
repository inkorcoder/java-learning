class variables {
	public static void main (String args[]){

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

		// string literal
		String stringVariable = "Long string can be here...";

		// print all
		System.out.println("byte (8 bit): " + byteVariable);
		System.out.println("short (16 bit): " + shortVariable);
		System.out.println("int (32 bit): " + intVariable);
		System.out.println("long (64 bit): " + longVariable);

		System.out.println("float (32 bit): " + floatPointVariable);
		System.out.println("double (64 bit): " + doublePointVariable);

		System.out.println("boolean (64 bit): " + trueOrFalseVariable);

		System.out.println("char (16 bit): " + charVariable);
		System.out.println("string: " + stringVariable);
	}
}