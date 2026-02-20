package logicBuilding;

public class ToggleCase {
	
	public static void main(String[] args) {
		String input = "B B Siddesha";
		
		StringBuilder sb = new StringBuilder();

		for (char ch : input.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			} else {
				sb.append(ch);
			}
		}
		
		System.out.println("Original String: " + input);
		System.out.println("Toggled Case: " + sb.toString());
	}
}