package test;

public class RegExMatching {

	public static boolean isValidEmail( String email) {
		return false;
	}
	
	public static void main(String[] args) {
		 System.out.println(isValidEmail( "martin@societe.com" ));
		 System.out.println(isValidEmail( "martin.societe.com" ));
		 System.out.println(isValidEmail( "martin@societe"));
		 
	}
}
