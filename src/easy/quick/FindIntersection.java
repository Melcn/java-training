package easy.quick;

import java.util.Scanner;

public class FindIntersection {

	public static String FindIntersection(String[] strArr) {
		String str1 = strArr[0];
		String str2 = strArr[1];
		String result = "";
		for (String chk : str1.split(", ")) {
			for (String chk2 : str2.split(", ")) {
				if (chk.equals(chk2)) {
					if (result.length() == 0) {
						result += chk;
					} else {
						result += "," + chk;
					}
				}
			}
		}
		if (result.isEmpty()) {
			return "false";
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] test = new String[] { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };

		System.out.println(FindIntersection(test));

	}

}
