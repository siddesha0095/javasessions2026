package twopointerapproach;

public class ReverseVowels {
    
    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
            } else if (!isVowel(chars[right])) {
                right--;
            } else {
                // Swap vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));      // holle
        System.out.println(reverseVowels("Interview"));  // entervIiw
        System.out.println(reverseVowels("SDET"));       // SDET (no change)
    }
}