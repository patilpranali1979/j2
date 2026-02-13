package chp;

class Calculator {

	   // Method to calculate the sum of two numbers
	   public int calculateSum(int number1, int number2) {
	       return number1 + number2;
	   }

	   // Method to calculate the difference between two numbers
	   public int calculateDifference(int number1, int number2) {
	       return number1 - number2;
	   }

	   // Main method to test the Calculator class
	   public static void main(String[] args) {
	       Calculator c = new Calculator();

	       int sum = c.calculateSum(10, 5);
	       System.out.println("Sum: " + sum);

	       int difference = c.calculateDifference(10, 5);
	       System.out.println("Difference: " + difference);
	   }
	}