import java.math.BigInteger;

public class Main {

    public static int sumOfDigits(BigInteger number) {
        String numberString = number.toString();
        int sum = 0;
      //converting numberstring String to Character array using toCharArray. 
      //fo each loop picks each Character from the array and convert it into numeric value using getNumericValue.
        for (char digit : numberString.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }

    public static void main(String[] args) {
        int exponent = 1000;
        BigInteger number = new BigInteger("2").pow(exponent);

        int result = sumOfDigits(number);
        System.out.println("The sum of the digits of 2^1000 is: " + result);
    }
}
