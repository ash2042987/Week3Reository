package week3;

import java.util.Scanner;

public class MoreArrays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		String[] names = new String[6];
				names[0] = "Sam"; 
				names[1] = "Tommy";
				names[2] = "Tim";
				names[3] = "Sally";
				names[4] = "Buck";
				names[5] = "Bob";
				
				System.out.println(names[0]);
				System.out.println(names[1]);
				System.out.println(names[2]);
				System.out.println(names[3]);
				System.out.println(names[4]);
				System.out.println(names[5]);
				
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
				
		System.out.println("Average of Number of Letters");
		

		for (String names2 : names) {
			System.out.println(names2);
		
		
			
			
			Scanner names3 = new Scanner(System.in);

		    System.out.println("3");

		    String words = names3.nextLine();

		    int count = 0;
		    double sum = 0;
		    double average = 0;

		    names3 = new Scanner(words);

		    while (names3.hasNext()) {

		        String userInput = names3.next();

		        double charNum = userInput.length();
		        sum = charNum + sum;
		        count++;

		        if (count > 0) {
		            average = sum / count;
		        }
		    }
		    System.out.println("Average word length = " + average);
		}
			
			
		int[] totalLettersInNames5 = {3, 5, 3, 5, 4, 3};

		System.out.println("names"); 
		
		for(int i=0; i< totalLettersInNames5.length; i++){ 
			System.out.println("current element is: " + totalLettersInNames5[i]); }
		System.out.println("names"); 
		for(int number: totalLettersInNames5){ 
			System.out.println(number); } 

		
		
		
		char[] letters2 = new char[] {'A', 'B', 'C', 'D', 'E', 'F'};
		
		String[] names6 = new String[] {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		System.out.println(letters2.length + ", ");
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
	}


