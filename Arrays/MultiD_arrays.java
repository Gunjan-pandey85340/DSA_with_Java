import java.util.*;
public class MultiD_arrays {

    public static boolean search(int matrix[][],int key){
        int n=3;int m=3;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("key is:"+i+","+j);
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n = 3; 
        int m =3;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }
        //output
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
              System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }
        search(matrix, 5);
     }
}
