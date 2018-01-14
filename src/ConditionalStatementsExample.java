public class ConditionalStatementsExample {
	public static void main(String[] args) {
		
		if(6 > 5) {
			System.out.println("6 was greater than 5!");
		}
		
		if (6 == 5) {
			System.out.println("6 was equal to 5. This should not be printed.");
		} else {
			System.out.println("6 was not equal to 5. This should be printed if the if statement failed.");
		}
		
		int x = 5;
		while (x < 7) {
			System.out.println("X was less than 7! X:" + x);
			System.out.println("Let's increase X.");
			x++;
		}
		System.out.println("X is no longer less than 7. X: " + x);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
