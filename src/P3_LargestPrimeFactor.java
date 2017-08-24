
public class P3_LargestPrimeFactor {
	
	
	public static void main(String[] args) {
		double n = 600851475143.0;
		// Start at 3 since  n isn't divisible by 2 
		
		for (int i = 3; i <= Math.sqrt(n); i+= 2)//check for factors till square root of number
		{
			while (n%i == 0)
			{
				//System.out.print(i + " ");
				n /= i;
			}
		}
		// highest prime number
		System.out.print(n);
	}


}
