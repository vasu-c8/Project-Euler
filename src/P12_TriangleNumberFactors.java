public class P12_TriangleNumberFactors{
        public static int triangleNumber(int n) {
            int sum = 0;
            for (int i = 0; i <= n; i++)
                sum += i;
            return sum;
        }

        public static void main(String[] args) {

            int j = 0;
            int n = 0; // n represents the triangle number corresponding to j
            int numberOfDivisors = 0;

            while (numberOfDivisors <= 500) {

                numberOfDivisors = 0;
                j++;
                n = triangleNumber(j);

                for (int i = 1; i <= Math.sqrt(n); i++)
                    if (n % i == 0)
                        numberOfDivisors++;

                // 1 to the square root of the number holds exactly half of the divisors
                // so multiply it by 2 to include the other corresponding half
                numberOfDivisors *= 2;
            }

            System.out.println(n);

        }
}
