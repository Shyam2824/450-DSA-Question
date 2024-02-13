// class max{
//     public int Max (int arr[], int n, int k){
//         // for(int i=0;i<n-1;i++){
//         //     for(int j =0;j<n-1;j++){
//         //         if(arr[i]<arr[j]){
//         //             int t= arr[i];
//         //             arr[i]=arr[j];
//         //             arr[j]=t;
//         //         }

//         //     }
//         //     if(i==k-1){
//         //         System.out.println(arr[i]);
//         //         break;
//         //     }
//         // }
//         return k;
//     } 
// }

import java.util.Scanner;

public class a_04findkth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Enter no of element");
        int n =sc.nextInt();
        
        int arr[]= new int[n];
        System.out.println("Enter the value");
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Kth :");
        int k= sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j= i+1;j<n-1;j++){
                if(arr[i]<arr[j]){
                    int t= arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }

            }
            if(i==k){
                System.out.println(arr[i]);
                break;
            }

        }
        System.out.println("Kth :");
        int a= sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j= i+1;j<n-1;j++){
                if(arr[i]>arr[j]){
                    int t= arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }

            }
            if(i==a){
                System.out.println(arr[i]);
                break;
            }

        }
        //System.out.println(arr[i]);
    }
}
