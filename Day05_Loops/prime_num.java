/**
 * prime_num
 */

public class prime_num {

    public static void main(String[] args) {
        int n = 25;
        if(n == 2){
            System.out.println("prime");
        }else{
            boolean isPrime = true;
            for(int i = 2; i<= Math.sqrt(n);i++){
                if(n%2==0){
                    isPrime = false;
                }

            }
        if(isPrime == true){
            System.out.println("n is a prime");
        }else{
            System.out.println("n is not prime:");
        }
        }
    }
}
