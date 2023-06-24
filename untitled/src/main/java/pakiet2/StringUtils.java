package pakiet2;

/**
 * Klasa zawierająca narzędzia do manipulacji łańcuchami znaków.
 */
public class StringUtils {
    /**
     * Sprawdza, czy podany łańcuch jest palindromem.
     *
     * @param str łańcuch do sprawdzenia
     * @return true, jeśli łańcuch jest palindromem, false w przeciwnym razie
     */
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
