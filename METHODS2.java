package week3;

public class METHODS2 {
	public static void main(String[] args) {
	}
	
	public static boolean main2(String[] args) {
		 for(int i=100;i<=200;i++){
	           if(i==101) {
			}
	     
	           
		 }
		return true;
	}
	public double[] sumAvg(double[] arr) {
	    double sum = 0;
	    for (double x : arr)
	        sum += x;
	    return new double[]{sum, sum/arr.length};
	}
	
	public static int[] reverse(int[] list) {
		double[] myList = {13, 9, 23, 64, 2, 8, 28, 93};

	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	         
		   int[] result = new int[list.length];

		   for (int i = 0, x = result.length - 1; i < list.length; i++, x--) {
		      result[x] = list[i];
		   
		   }
		   return result;
		}
		return list;
}
	public static void willBuyADrink() {
		double itemPrice = 10.50;
		double amountInWallet = 20;
		boolean haveEnoughToBuy = true;
		
		
		System.out.println(itemPrice);
		System.out.println(amountInWallet);
		System.out.println(haveEnoughToBuy);
	
		
		
	}
}
	      



		
	
	

	
