package Basic_Sorting;

import java.util.*;
import java.util.Collection;
public class sort {
     public static void bubbleSort(int arr[]){
        for(int turns =0; turns<arr.length-1;turns++){
            for(int j = 0;j<arr.length-1-turns;j++ ){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void SelectionSort(int arr[]){
        for(int i =0;i<=arr.length-1;i++){
            int sM = i;
            for(int j = i+1;j<=arr.length-1;j++){
                if(arr[sM]>arr[j]){
                    sM = j;
                }
            }
            // swap
            int temp = arr[sM];
            arr[sM] = arr[i];
            arr[i] = temp;
        }
    }


    public static void InsertionSort(int arr[]){
        for(int i = 1;i<=arr.length-1;i++){
            int curr = arr[i];// temp element store
            int prev = i-1;
            // finding out the correst pos to insert
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<=arr.length-1;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count [] = new int [largest+1];
        for(int i =0;i<arr.length-1;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i = 0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i =0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] ={1,4,1,3,2,4,3,7};
        //Arrays.sort(arr,Collections.reverseOrder());
        // bubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        // Arrays.sort(arr);
        //Arrays.sort(arr,0,3,Collections.reverseOrder());
        CountingSort(arr);
        printArr(arr);
    }
}