/**
 * one_n
 */
import java.util.*;
public class one_n {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int c = 1;
        int n = sc.nextInt();
        while(c<=n){
            System.out.print(c+" ");
            c++;
        }
        sc.close();
    }
}