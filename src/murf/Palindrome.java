package murf;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isplaindrome("Maam"));
    }
    public static boolean isplaindrome(String str) {
        if (str.length() == 0 || str == null) {
            return false;
        }
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if (start != end) {
                return false;
            }

        }
        return true;

    }
}
