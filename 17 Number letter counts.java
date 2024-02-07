public class Main {
    // Arrays to store word representation
    //final keyword means that the value of the field cannot be changed once it's assigned.
    private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    // Method to convert a number to its word representation
    private static String numberToWords(int number) {
        // Handling the special case for 1000
        if (number == 1000) {
            return "onethousand";
        }

        StringBuilder words = new StringBuilder();//to use append fxn we use  StringBuilder

        // Extracting hundreds digit
        int hundredsDigit = number / 100;
        if (hundredsDigit > 0) {
            words.append(ones[hundredsDigit]).append("hundred");
            // Adding "and" if there are remaining digits
            if (number % 100 != 0) {
                words.append("and");
            }
        }

        // Extracting remainder after hundreds
        int remainder = number % 100;
        if (remainder > 0) {
            // Handling cases less than 10 eg:407
            if (remainder < 10) {
                words.append(ones[remainder]);
            }
            // Handling cases between 10 and 19 eg:417
            else if (remainder < 20) {
                words.append(teens[remainder - 10]);
            }
            // Handling cases above 20 eg:437
            else {
                int tensDigit = remainder / 10;
                int onesDigit = remainder % 10;
                words.append(tens[tensDigit]);
                if (onesDigit > 0) {
                    words.append(ones[onesDigit]);
                }
            }
        }

        return words.toString();
    }

    // Method to count letters in words for a range of numbers
    public static int countLettersInWords(int start, int end) {
        int count = 0;

        // Iterating through the range of numbers
        for (int i = start; i <= end; i++) {
            // Converting each number to words
            String words = numberToWords(i);
            // Adding the length of the resulting word to the total count
            count += words.length();
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        // Calculating the total number of letters used for numbers from 1 to 1000
        int result = countLettersInWords(1, 1000);
        // Printing the result
        System.out.println("The total number of letters used is: " + result);
    }
}
