package test;

public class RegExMatching {

	// regular-expressions.info

	public static boolean isValidIp(String ip) {
		//192.168.100.10
		return false;
	}

	public static boolean isValidDate(String date) {
		// String regExp = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
		// String regExp = "^[0_9]{2}/[0_9]{2}/[0_9]{2}([0_9]{2})?$";
		String regExp = "^{0[1-9]|[12][0-9]|3[01]}/(0[1-9]|1[0-2])/(19|20)?([0-9]{2})$"; // jj/mm/aaaa || jj/mm/aa
		return date.matches(regExp);
	}

	public static boolean isValidEmail(String email) {
		// String regExp = "^.+@.+\\..+$";
		// String regExp = "^[A-Za-z0-9._-]+@.+\\.[a-z]{2,}$";
		String regExp = "^[\\w.-]+@.+[\\w.-]+\\.[a-z]{2,}$";
		return email.matches(regExp);
	}

	public static void main(String[] args) {
//		System.out.println(isValidEmail("martin@societe.com"));
//		System.out.println(isValidEmail("martin.societe.com"));
//		System.out.println(isValidEmail("martin@societe"));
		System.out.println(isValidDate("30/05/2017"));
		System.out.println(isValidDate("30/05/17"));
		System.out.println(isValidDate("jj/mm/aaaa"));

	}
}
