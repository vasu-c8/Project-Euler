public class P6_SumSquareDifference {
    private static int squareOfSum(int num) {
        int sum = (num * (num + 1)) / 2;
        return sum * sum;
    }


    public static int sumOfSquares(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static void main(String[] args){
        int difference = squareOfSum(100) - sumOfSquares(100);
        System.out.printf("Difference is %d\n", difference);
    }
}
