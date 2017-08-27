public class P7_PrimeNumber10001 {
    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }

    /* returns the nth prime number */
    public static long nthPrime(long n) {
        int numberOfPrimes = 0;
        long prime = 1;

        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }

    /* returns true if parameter n is a prime number, false if composite or neither */
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        /*Instead of checking till n, we can check till √n because a
        larger factor of n must be a multiple of smaller factor that has been already checked*/
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
