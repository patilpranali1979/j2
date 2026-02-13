package q2;


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

	       int sum=c.calculateSum(10, 5);
	       System.out.println("sum "+sum);
	       
	       int diffrence =c.calculateDifference(10, 3);
	       System.out.println("deffrence "+diffrence);
	       
	   }
	}

