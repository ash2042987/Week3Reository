package week3;

public class MoreArrays3 {

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
		
for (int i = 1; i < names.length; i++) {
	System.out.println(names[i]);
}
		
		
	int[] namesLength = new int [6];
		
	for (int i = 0; i <= namesLength.length; i++) {
		System.out.println("name:" + "Sam==3" +"Tommy ==5"+"Tim==3"+"Sally==5"+"Buck==4"+"Bob==3"+"EqualTotalCharacters==18");
				
	}

	}

}
