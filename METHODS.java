package week3;

public class METHODS { 

	public static void main(String[] args) {
		String firstName = "Ash";
		String lastName = "Sanchez";
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		
	}
	
		public static String createFullName(String x, String y) {
			String fullName = x + " " + y;
			return fullName;
			
		}

		public static void main2(String[] args) {
			
		System.out.println(multiplyString("Hello", 3));
	}
		
		
		
		public static String multiplyString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}

		

		public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += number;
			
		}
		return sum;
		
}
		
		}

	
		

				
		

