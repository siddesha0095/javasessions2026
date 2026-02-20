package logicBuilding;



public class CountVowels {

	public static void main(String[] args) {

		String input = "BananaAAa";
		int count = 0;

		for (int i = 0; i < input.length(); i++) {

			//char ch = input.charAt(i);
			
			char ch=Character.toLowerCase(input.charAt(i));
		

			// make comparison case-insensitive
			if (ch == 'a' ) {
				count++;
			}
		}

		System.out.println("Total 'a' count = " + count);
	}
}
