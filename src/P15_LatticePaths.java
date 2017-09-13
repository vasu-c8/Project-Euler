import java.math.BigInteger;

public class P15_LatticePaths {
/* Source:http://jasoncampos.blogspot.com/2011/06/project-euler-15.html
It takes 20 moves to the right,and 20 moves down to get to the end point no matter which route you decide to take.
 So only thing that matters is when you decide to make a right turn and when you decide to make a down turn.
 All in all, there are 40 moves required to get to the end point no matter which route you chose (again... 20 right, 20 down).
 So this is a combinations problem
 Picture it like this:
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
(40 blank spaces)


How many ways are there to place 20 "D"s in the 40 blank spaces.


Once the 20 "D"s are placed, the rest of the blank spaces get filled with "R"s and you achieve a sequence of "R"s and "D"s that will lead to the end point every time.


Mathematically, this is represented as "n  choose k", where n is the number of spaces and
k the number of "D"s. The equation is:


n!/( n! * (n-k)! )


Substituting in the values 40 for n, and 20 for k:


40! / (20! * 20!)
            n!
C(n,r) =   ———-
          r!*(n-r)!

The number of how many good routes we have can be found by finding how
many combinations of 20 R’s we can have in our 40 moves, so we want to
calculate:

              40!
C(40,20) =   ———-
           20!*(40-20)!

 */
    public static void main(String args[]){
        int n = 40;     // The total number of moves for any one path (right + down)
        int r = 20;     // The total number of right moves for any one path

        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n - r))));
    }
    public static BigInteger factorial( int n1 )
    {
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= n1; i ++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        return n;
    }
}
