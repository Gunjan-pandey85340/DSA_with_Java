import java.util.*;
public class Sum_of_nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int sum = 0;
        while(c<=n){
            sum +=c;
            c++;

        }System.out.println("sum is :"+sum);
        sc.close();
    }
}
