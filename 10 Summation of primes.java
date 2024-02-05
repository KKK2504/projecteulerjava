public class Main {
    public static void main(String[] args) {
        int limit = 2000000; 
        int sum=0;

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                //System.out.print(i + " ");
                sum=sum+i; //sumation of all prime number
            }
        }
        System.out.print(sum);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
