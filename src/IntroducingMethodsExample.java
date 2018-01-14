public class IntroducingMethodsExample {

	public static void main(String[] args) {
		int[] myArr = {1, 2, 3, 4, 5};
		
		// I'm too lazy to write a for loop every time I want to print an array
		// So, I created a function that does it for me. All I need to do is pass the array to it.
		printArray(myArr);
		
		myArr[2] = 999;
		printArray(myArr);
	}
	
	// You can ignore the static modifier for now. That's for Object-Oriented Programming.
	public static void printArray(int[] arr) {		// Notice how we are calling it arr here, but in the main method it has a different name: myArr
		System.out.println("Printing array");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Finished printing");
	}
}
