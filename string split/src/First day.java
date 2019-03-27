
public class stringsplit {

	public static void main(String[] args) {

		String myString = "Reveal";
		char[] reverseArray = myString.toCharArray();
		for (int i = reverseArray.length - 1; i >= 0; i--)
			System.out.println(reverseArray[i]);

	}

}
