public class P4_LargestPalindromeProduct {

    public static void main(String args[]){

        int largest = 0;
        for (int i = 100; i < 1000; i++){
            for (int r = 100; r < 1000; r++){
                String x = Integer.toString(i * r);
                String y = new StringBuilder(x).reverse().toString();
                int strX = Integer.parseInt((x));
                if (x.equals(y)) {
                    if (strX > largest){
                        largest = (strX);
                    }
                }

            }
        }
        System.out.println(largest);
    }


}
