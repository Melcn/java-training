package test;

public class RegExMatching {

	public static boolean isValidEmail( String email) {
		String regExp = "^.+@.+\\..+$";
		return email.matches(regExp);
	}
	
	public static void main(String[] args) {
		 System.out.println(isValidEmail( "martin@societe.com" ));
		 System.out.println(isValidEmail( "martin.societe.com" ));
		 System.out.println(isValidEmail( "martin@societe"));
		 
	}
}
