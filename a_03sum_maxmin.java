// sum of max and min in array

import java.util.Scanner;

class Sum_max{
    public int sum(int arr[],int n){

        int max= arr[0];
        int min= arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return (max+min);
    }
}


public class a_03sum_maxmin {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter no. of element");
         int k = sc.nextInt();

         System.out.println("Enter the value");

        int arr[]= new int[k];
        for(int i =0;i<k;i++){
            arr[i]= sc.nextInt();
        }
        Sum_max m = new Sum_max();
        //m.sum(arr, k);
        System.out.println(m.sum(arr, k)); 
    }
    
}
