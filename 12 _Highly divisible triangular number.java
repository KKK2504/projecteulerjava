 public class Main {
    public static void main(String[] args) {
        // Set the target number of divisors
        int targetDivisors = 500;
        
        // Find the first triangle number with over 'targetDivisors' divisors
        long result = findTriangleWithDivisors(targetDivisors);
        
        // Print the result
        System.out.println("The first triangle number with over " + targetDivisors + " divisors is: " + result);
    }

    // Method to calculate the nth triangle number
    public static long getTriangleNumber(int n) {
        return n * (n + 1) / 2;
    }

    // Method to count the number of divisors of a given number
    public static int countDivisors(long num) {
        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                count++; // Increment count for factors
            }
        }
        return count;
    }

    // Method to find the first triangle number with over a specified number of divisors
    public static long findTriangleWithDivisors(int targetDivisors) {
        int n = 1;
        while (true) {
            // Calculate the current triangle number
            long triangleNumber = getTriangleNumber(n);
            
            // Count the divisors of the current triangle number
            int divisorsCount = countDivisors(triangleNumber);
            
            // Check if the number of divisors meets the target
            if (divisorsCount >= targetDivisors) {
                return triangleNumber; // Return the triangle number
            }
            
            n++; // Move to the next triangle number
        }
    }
}
