public class OperatorsExample {
	public static void main(String[] args) {
		
		// Modifying operators: +, -, *, /, %
		int x = 1;
		System.out.println("x = 1 : " + x);
		x += 4;
		System.out.println("x +=4 : " + x);
		x -= 2;
		System.out.println("x -= 2 : " + x);
		x *= 2;
		System.out.println("x *= 2 : " + x);
		x /= 3;
		System.out.println("x /= 3 : " + x);
		
		x = 8;		// Try changing this to even and odd numbers
		if(x % 2 == 0) {
			System.out.println("x was evenly divisble by 2");
		} else {
			System.out.println("x was odd");
		}
		
		x++;	// Same as x = x + 1
		x--;	// Same as x = x - 1

		// Comparative operators: >, <, >=, <=, ==, !=
		boolean ans = 3 > 2;
		System.out.println("Now we use comparative operators, which will return a boolean value. 3 > 2: " + ans);
		
		ans = 5 == 6;
		System.out.println("Is 5 equal to 6? " + ans);
		
	}
}
