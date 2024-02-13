public class Main {

    public static void main(String[] args) {
        int result = findSmallestInteger(); 
        System.out.println("The smallest positive integer x is: " + result);
    }

    public static int findSmallestInteger() {
        int x = 1;
        while (true) {
            String original = String.valueOf(x);
            String twice = String.valueOf(2 * x);
            String thrice = String.valueOf(3 * x);
            String fourTimes = String.valueOf(4 * x);
            String fiveTimes = String.valueOf(5 * x);
            String sixTimes = String.valueOf(6 * x);

            if (check(original, twice) &&
               check(original, thrice) &&
                check(original, fourTimes) &&
                check(original, fiveTimes) &&
                check(original, sixTimes)) {
                return x;
            }
            x++;
        }
    }

    public static boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[10]; // Assuming digits are from 0 to 9

        for (int i = 0; i < str1.length(); i++) {
            //increasing and decreasing the index value so tht to verify the numbers are present in both original and 2x,3x,4x.... strings.final the count array should be zero.
         
            count[str1.charAt(i) - '0']++;
            count[str2.charAt(i) - '0']--;
        }
 //if all the number inside the count array is zero then it is the number we required.
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
