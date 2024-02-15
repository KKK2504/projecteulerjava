import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {
    
    public static boolean isPandigital(String str) {
        if (str.length() != 9) {
            return false;
        }
        char[] digits = str.toCharArray();
        Arrays.sort(digits);
        return new String(digits).equals("123456789");
    }

    public static void main(String[] args) {
        Set<Integer> pandigitalProducts = new HashSet<>();

        // Iterate through possible multiplicands and multipliers setting the  limit 9999 and 99 so as to get the total length 
        //of 9 with all digits in it.
        for (int multiplicand = 1; multiplicand < 10000; multiplicand++) {
            for (int multiplier = 1; multiplier < 100; multiplier++) {
                int product = multiplicand * multiplier;
                String identity = Integer.toString(multiplicand) + Integer.toString(multiplier) + Integer.toString(product);
                if (identity.length() == 9 && isPandigital(identity)) {
                    pandigitalProducts.add(product);
                }
            }
        }

        // Calculate the sum of unique pandigital products
        int sumOfProducts = 0;
        for (int product : pandigitalProducts) {
            sumOfProducts += product;
        }

        System.out.println("Sum of all products whose identity is pandigital: " + sumOfProducts);
    }
}

