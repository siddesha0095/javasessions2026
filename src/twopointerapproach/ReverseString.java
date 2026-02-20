package twopointerapproach;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello";
		StringBuilder sb=new StringBuilder();
		char charArray[] = input.toCharArray();

		
		System.out.println(input);

		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);

		}
		
		System.out.println(sb);
	}

}
