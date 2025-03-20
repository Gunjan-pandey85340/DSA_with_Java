import java.util.*;
public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int sumOdd  = 0;
        int sumEven = 0;
        do{
            System.out.println("Enter the number");
            num = sc.nextInt();
            if(num %2 == 0){
                sumEven += num;
            } else{
                sumOdd +=num;
            }
            System.out.println("choice to continue?");
            choice = sc.nextInt();
        } while(choice == 1);
        System.out.println("sum of even num" + "="+sumEven);
        System.out.println("sum of odd "+sumOdd);
        sc.close();
    }
}
