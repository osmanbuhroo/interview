package Interview;

public class Pattern {
    public static void main(String[] args) {
        int n = 4; // Change the value of n for different patterns

        // Loop for each row
        for (int i = 1; i <= n; i++) {

            // Loop to print numbers or asterisks
            for (int j = 1; j <= i * 2; j++) {
                if (j % 2 == 0) {
                    // Print numbers for even positions
                    System.out.print(j / 2 + " ");
                } else {
                    // Print asterisks for odd positions
                    System.out.print("*");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
