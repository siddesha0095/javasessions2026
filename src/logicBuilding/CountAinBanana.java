package logicBuilding;



public class CountAinBanana {

	public static void main(String[] args) {

		String input = "Banana";
		int count = 0;

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			// make comparison case-insensitive
			if (ch == 'a' || ch == 'A') {
				count++;
			}
		}

		System.out.println("Total 'a' count = " + count);
	}
}
