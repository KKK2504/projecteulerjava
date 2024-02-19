public class Main {
    public static boolean isLychrel(int number) {
        // Iterate through the reverse and add process for up to 50 iterations
        for (int i = 0; i < 50; i++) {
            // Add the number to its reverse
            number += reverseNumber(number);
            // Check if the result is a palindrome
            if (isPalindrome(number)) {
                // If a palindrome is found, return false (not a Lychrel number)
                return false;
            }
        }
        // If no palindrome is found within 50 iterations, return true (assumed Lychrel number)
        return true;
    }
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
       
        while (number > 0) {
            // Extract the last digit of the number and add it to the reversed number
            reversedNumber = reversedNumber * 10 + number % 10;
            // Remove the last digit from the original number
            number /= 10;
        }
        // Check if the original number is equal to its reversed version
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isLychrel(i)) {
                // If it's a Lychrel number, increment the count
                count++;
            }
        }
        System.out.println(count + " Lychrel numbers");
    }
}

