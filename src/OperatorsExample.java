public class OperatorsExample {
	public static void main(String[] args) {
		
		// Modifying operators: +, -, *, /, %
		int x = 5 + 5;
		System.out.println("X starts off as the value of 5 + 5: " + x);
		
		x = x + 2;
		System.out.println("We add 2 to the value X already had: " + x);
		
		x += 7;
		System.out.println("The += operator is similar to x = x + #: " + x);

		x -= 1;
		x *= 2;
		x /= 3;
		System.out.println("Here we are doing a series of operations on the variable: " + x);
		
		x++;
		System.out.println("This is a shortcut to incrementing x by 1. This is so common that is has"
				+ " it's own operator. Hint this is where C++ got it's name. Anyway, here's the value"
				+ " of x: " + x);
		
		x--;
		System.out.println("We can subtract too! x: " + x);
		
		x %= 5;
		System.out.println("This is a weird one. The modulus operator returns the remainder of a division."
				+ " So, 12 / 5 = 2 with a remainer of: " + x);

		// Comparative operators: >, <, >=, <=, ==, !=
		boolean ans = 3 > 2;
		System.out.println("Now we use comparative operators, which will return a boolean value. 3 > 2: " + ans);
		
		ans = 5 == 6;
		System.out.println("Is 5 equal to 6? " + ans);
		
	}
}
