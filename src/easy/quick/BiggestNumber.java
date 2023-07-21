package easy.quick;

public class BiggestNumber {

	public static void main(String[] args) {
		int arr[] 	= new int[] {4, 6, 2, 9, 5};
		int big 	= 0;
		int sum 	= 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
			if(big < arr[i]) {
				big = arr[i];
			}
		}
		
		System.out.println("La somme des elements est : " + sum);
		System.out.println("Le plus grand nombre est " + big);
		
	}

}
