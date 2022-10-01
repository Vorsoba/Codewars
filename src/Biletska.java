public class Biletska {
    /**
     * Method accepts double number for base and integer number for exponent,
     * returns result of calculation the power of a number for positive exponent,
     * negative exponent or for zero exponent, uses the mathematical logic.
     *
     * @param base double number
     * @param exponent integer number
     * @return result of calculation the power of a number for positive exponent
     */
    private static double raiseToPower(double base, int exponent) {

        double result = 1;
        if (exponent == 0) return result;

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
            return result;
        } else {
            for (int i = 0; i > exponent; i--) {
                result = result * base;
            }
            return 1 / result;
        }
    }

    
    public static void main(String[] args) {
        System.out.println("Result of calculation: " + raiseToPower(-5,7));
        System.out.println("To check result with method Math.pow(): " + Math.pow(-5, 7) );
    }
}
