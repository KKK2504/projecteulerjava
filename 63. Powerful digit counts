//The limit of 24 for the exponent is chosen because 9^25
 // has 26 digits. This means that for any exponent greater than 25, 
 // the resulting number will have more digits than the exponent itself. 
 // Therefore, it's unnecessary to check exponents beyond 24.

 public class Main {
  public static void main(String[] args) {
        int result = countNthPowerDigits();
        System.out.println("Number of n-digit positive integers that are also an nth power: " + result);
    }
    public static int countNthPowerDigits() {
        int count = 0;
        for (int base = 1; base < 10; base++) {
            for (int exponent = 1; exponent < 25; exponent++) {
                int power = (int) Math.pow(base, exponent);
                int powerLength = String.valueOf(power).length();

                if (powerLength == exponent) {
                    count++;
                } else if (powerLength > exponent) {
                    // If the length becomes greater than exponent, no need to continue for this base
                    break;
                }
            }
        }
        return count;
    }
}
