public class kadane {

    public static void sumOfSubArray(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        
        for(int i = 0;i<= arr.length-1;i++){
            currSum += arr[i];
            if(currSum<0){
                currSum=0;
                
            }
            
            MaxSum = Math.max(currSum,MaxSum);

        }
        System.out.println("our max subarray sum is"+ "="+MaxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        sumOfSubArray(arr);
    }
}
