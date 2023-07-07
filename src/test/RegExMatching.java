package test;

public class RegExMatching {

	public static boolean isValidEmail( String email) {
		//String regExp = "^.+@.+\\..+$";
		//String regExp = "^[A-Za-z0-9._-]+@.+\\.[a-z]{2,}$";
		String regExp = "^[\\w.-]+@.+[\\w.-]+\\.[a-z]{2,}$";
		return email.matches(regExp);
	}
	
	public static void main(String[] args) {
		 System.out.println(isValidEmail( "martin@societe.com" ));
		 System.out.println(isValidEmail( "martin.societe.com" ));
		 System.out.println(isValidEmail( "martin@societe"));
		 
	}
}
