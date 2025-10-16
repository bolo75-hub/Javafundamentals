package datastructure;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {

		String querySQL = "select * from user where username = `Manolo` and email = `manolo@` ";
		querySQL = "select * from user where username = ? and email = ?";

		String[] params = { "manolo", "d" };
		System.out.println(sqlProcess(params, querySQL));
	}

	private static String sqlProcess(String[] parameters, String sql) {

		char[] characters = sql.toCharArray();
		System.out.println();
		int i = 0;
		// characters c = 'j';
		String Sum = "";
		for (char character : characters) {
			System.out.println("the current character is " + character);
			// System.out.println("the current character is " + character);
			// relational operator of inequality is "!=" "no es igual"
			if (character != '?') {
				// "+=" operator to connect
				Sum += character;
			} else {// character == '?'
				Sum += parameters[i];
				i++;
			}
		}
		System.out.println("the new string is : " + Sum);
		System.out.println("sub string" + sql.subSequence(0, 10));

		System.out
				.println("replace all ? with the value passed through the username variable" + sql.replace("?", "fg"));

		System.out.println(Arrays.toString(characters));
		System.out.println(sql.indexOf("?"));
		System.out.println(sql.charAt(36));

		return "";

	}

}
