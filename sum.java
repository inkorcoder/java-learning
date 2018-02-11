// we need to import Scanner class
import java.util.Scanner;

class sum {
	public static void main (String args[]){

		// and create new instance from terminal
		Scanner myInput = new Scanner(System.in);

		// and create 3 variables for adding and result
		double doubleOne, doubleTwo, doubleResult;

		// it will be printed after hitting "enter" button
		// previously we have use .nextLine() method
		// but in java we need to use method for specific type
		// .nextLine() - for strings
		// .nextDouble() - for doubles
		System.out.println("Enter first number (with float point):");
		doubleOne = myInput.nextDouble();

		System.out.println("Enter second number (with float point):");
		doubleTwo = myInput.nextDouble();

		doubleResult = doubleOne + doubleTwo;
		System.out.println(doubleResult);

		// IMPORTANT !!!
		// under Ubuntu 16.04 i have an exeption like:
		// "Exception in thread "main" java.util.InputMismatchException"
		// i just type commas instead of dots and it workes for me
		// 34,6 + 54,2 = 88.80000000000001
	}
}