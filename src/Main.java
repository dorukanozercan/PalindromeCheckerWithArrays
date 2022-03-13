import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        palindromeChecker("hello"); // returns false
        palindromeChecker("tenet"); // returns true
        palindromeChecker("level"); // returns true
        palindromeChecker("randomWord"); // returns false
        palindromeChecker("radar"); // returns true

    }

    public static boolean palindromeChecker (String inputString) {
        char[] characterArray = new char[inputString.length()];
        char[] reverseArray = new char[inputString.length()];

        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            characterArray[i] = inputString.toLowerCase().charAt(i);
        }

        while (count < inputString.length()) {
            for (int i = inputString.length() - 1; i >= 0; i--) {
                reverseArray[count] = inputString.toLowerCase().charAt(i);
                count++;
            }
        }

        System.out.println("character array: " + Arrays.toString(characterArray));
        System.out.println("reversed array : " + Arrays.toString(reverseArray));

        if (Arrays.equals(characterArray, reverseArray)) {
            return true;
        } else {
            return false;
        }



    }
}
