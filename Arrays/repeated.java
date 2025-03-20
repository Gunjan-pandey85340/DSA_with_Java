public class repeated {
    // question 1 assignment arrays
    public static boolean repeatedEle(int arr[]){
        for(int i =0;i<=arr.length-1;i++){
            for(int j = i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // question 2 assignment arrays
    
    public static void main(String[] args) {
        int arr [] ={1,2,3};
        System.out.println(repeatedEle(arr));
    }
}
