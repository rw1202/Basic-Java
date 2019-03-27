
public class Calculator {

	public static void main(String[] args) {

		math(2, 2, "*");

	}

	static void math(double parameterX, double parameterY, String parameterI) {

		if (parameterI.equals("+")) {
			parameterX = parameterX + parameterY;
			System.out.println(parameterX);
		}

		if (parameterI.equals("-")) {
			parameterX = parameterX - parameterY;
			System.out.println(parameterX);
		}

		if (parameterI.equals("*")) {
			parameterX = parameterX * parameterY;
			System.out.println(parameterX);
		}

		if (parameterI.equals("/")) {
			parameterX = parameterX / parameterY;
			System.out.println(parameterX);
		}
	}
}
