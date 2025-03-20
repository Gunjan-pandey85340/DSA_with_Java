/**
 * array
 */
public class array {
    // linear search 
    public static int linearSearch(int arr[], int key ){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]== key) return i;
        }
        return -1;
    }
    
    // largest number in the given array
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<= arr.length-1;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    // smallest number in the given array 
    public static int smallestNum(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length-1;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // binary search in the given array
    public static int binarySearch(int arr[],int key){
        int start = 0 ; int end = arr.length-1;

        while(start <= end){
            //comparisons
            int mid = (start+end)/2;
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key){ // right
                start = mid+1;
            }else{// left
                end = mid-1;
            }

        }
        return -1;
    }

    // reverse of the array 
    public static void revArray(int arr[]){
        int lst = 0; int last = arr.length-1;
        while(lst < last){
            int temp = arr[last];
            arr[last] = arr[lst];
            arr[lst] = temp;

            lst++;
            last--;
        }
    }


// pairs in the array 

    public static void Pairs(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int curr = arr[i]; 
            for(int j = i+1 ; j<arr.length-1;j++){
                System.out.print("(" + curr + "," + arr[j]+ ")" );
                tp++;
            }
            System.out.println();
        }System.out.println("total pairs :" + tp);
    } 

// print the subArrays 
    public static void PrintSubArr(int arr[]){
        int sum =0;
        for(int i = 0; i< arr.length-1;i++){
            int start = i;
            for(int j = i ; j< arr.length-1;j++){
                int end = j;
                for(int k = start ; k<=end ; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                System.out.println();
            }
            System.out.println();
           
        }
    

    }

// print the sum of subarray max sum and min sum 


    public static void main(String[] args) {
        // int arr [] = {-1,0,2,4,10,12,14,16,18,420};
        int arr [] = {2,4,6,8,10};
        int key = 10;
        int idx = linearSearch(arr, key);
        if(idx == -1) {
            System.out.println("Key not found :");
        }else{
            System.out.println("key is at index "+idx);
        }
       System.out.println("largest number of the given array is:"+largestNum(arr));
       System.out.println("smallest number of the given array is :"+ smallestNum(arr));
       System.out.println("index for key is :"+ binarySearch(arr, key));
       revArray(arr);
       for(int i = 0;i<= arr.length-1;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       Pairs(arr);

       PrintSubArr(arr);
    }
}