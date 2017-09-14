import java.math.BigInteger;

public class P16_PowerDigitSum {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(2);
        int power = 1000;
        result = base.pow(power);
        String string_result = new String(result.toString());
        int sumOfDigits  = 0;
        for (int i = 0; i < string_result.length(); i++)
        {
            Character c = new Character(string_result.charAt(i));
            String s = c.toString();
            int n = Integer.parseInt(s);
            sumOfDigits = sumOfDigits + n;
        }
        System.out.println(sumOfDigits);
    }
}
