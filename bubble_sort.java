import java.util.Scanner;

public class bubble_sort {
    
    public static void main(String[] args) {
        int n, i, k , ptr, temp;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Array: ");
        n= sc.nextInt();
        int a[]= new int[n];

        System.out.println("Enter Array: ");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for(i=0; i<n-1; i++){
            for(k=0;k<n-i-1;k++){
                if(a[k]>a[k+1]){
                    temp=a[k];
                    a[k]= a[k+1];
                    a[k+1]=temp;
                }
            }
        }

        for(i=0;i<n;i++)
        System.out.println("Enter Element: " + a[i]);
        
    }
}
