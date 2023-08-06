public class FaultyKeyboard {
    public static String faultyKeyboardString(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentSubstring = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'i') {
                currentSubstring.reverse();
                result.append(currentSubstring);
                currentSubstring.setLength(0); // Clear the substring for the next iteration
            } else {
                currentSubstring.append(c);
            }
        }

        // Append any remaining characters in the substring
        result.append(currentSubstring);

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "poiinter";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + faultyKeyboardString(s1));

        System.out.println("Input: " + s2);
        System.out.println("Output: " + faultyKeyboardString(s2));
    }
}
