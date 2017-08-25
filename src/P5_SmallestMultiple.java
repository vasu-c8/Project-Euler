public class P5_SmallestMultiple {
    final static int multiple = 2520;

    public static void main(String[] args)
    {

        int smallestM = 2520;
        boolean done = false;

        while (!done)
        {
            for (int i = 11; i <= 20; i++)
            {
                if ( smallestM % i > 0 )
                {
                    smallestM += multiple;
                    break;
                }

                if ( i == 20 )
                    done = true;
            }
        }

        System.out.printf("The smallest multiple divisible by 1-20 is %d\n",  smallestM);
    }
}
