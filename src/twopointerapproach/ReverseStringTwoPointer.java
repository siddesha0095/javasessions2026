package twopointerapproach;

import java.util.Arrays;

public class ReverseStringTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello";
		char charArray[] = input.toCharArray();
		System.err.println(charArray);
		System.out.println(Arrays.toString(charArray));
		int left = 0;
		int right = charArray.length - 1;
		char temp;
		while (left < right) {

			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;

		}
		System.out.println((charArray));
		System.out.println(Arrays.toString(charArray));
	}

}
