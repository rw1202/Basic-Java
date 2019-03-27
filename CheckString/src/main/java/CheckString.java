
public class CheckString {

	String parameterX = "Same?";

	public void main(String[] args) {

		System.out.println(stringMatch(parameterX, "till"));

	}

	static String stringMatch(String parameterX, String parameterY) {
		if (parameterX.equals(parameterY)) {
			return ("Strings are identical");

		} else {
			return ("Strings are not identical");
		}

	}
}
