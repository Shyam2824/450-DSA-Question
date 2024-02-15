import java.util.Scanner;

public class a_05sortArray {
    public void sort(int a[],int n){
        int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                z++;
            }
            if(a[i]==1){
                o++;
            }
            if(a[i]==2){
                t++;
            }
        }

        
        int index=0;
        for(int i=1;i<=z;i++)
            a[index++]=0;
        
        for(int i=1;i<=o;i++)
            a[index++]=1;
        
        for(int i=1;i<=t;i++)
            a[index++]=2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
         int a[]= new int[k];
         System.out.println("Enter the value");
         for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
         } 
         a_05sortArray s= new a_05sortArray();
         s.sort(a, k);
         System.out.println("Sorted array:");
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + " ");
         }
        }
    
}
