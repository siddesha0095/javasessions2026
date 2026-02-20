package twopointerapproach;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello";
		char charArray[] = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);

		}
		System.out.println();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);

		}
	}

}
