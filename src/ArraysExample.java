public class ArraysExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 9;
		arr1[2] = 8;
		
		// Print arr1
		System.out.println("Arr1: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		int[] arr2 = {5, 6, 7};
		
		// Print arr2
		System.out.println("Arr2: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// Let's edit arr2
		arr2[0] = 1;
		arr2[2] = 3;
		
		// Print arr2 after changes
		System.out.println("Arr2: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
