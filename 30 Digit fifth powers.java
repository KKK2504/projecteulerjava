public class Main {
    public static int sumOfFifthPowers(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 5);
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = findSumOfFifthPowerNumbers();
        System.out.println(result);
    }
    public static int findSumOfFifthPowerNumbers() {
        int sum = 0;

        // Upper bound: 9^5 * 5 = 295245 (5 digits)
        for (int i = 10; i <= 295245; i++) {
            if (i == sumOfFifthPowers(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
