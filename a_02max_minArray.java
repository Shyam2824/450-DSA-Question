import java.util.Scanner;
class max_min{

    public void  getMinMax( long arr[],long n){
        Long max= Long.MIN_VALUE;
        Long min= Long.MAX_VALUE;
        
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    
    }
}
public class a_02max_minArray{
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Element");
        int k= sc.nextInt();
        long[] arr= new long[k];

        System.out.println("Enter value");
        for(int i=0;i<k;i++){
            arr[i]= sc.nextInt();
        }

        max_min m= new max_min();
        m.getMinMax(arr, k);
        // int max= arr[0];
        // int min= arr[0];

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // // }
        // System.out.println("Maximum element: " + max);
        // System.out.println("Minimum element: " + min);
       
    //    for(int i=0;i<k;i++){
    //    System.out.println(arr[k]);
    //   }
    }
}