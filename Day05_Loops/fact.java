import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int fact = 1;
        System.out.println("enter the positive numbers");
        num = sc.nextInt();
        for(int i = 1; i<=num;i++){
            fact *=i;
        }

        System.out.println("factorial of num is :"+ fact);
        sc.close();
    }
}
