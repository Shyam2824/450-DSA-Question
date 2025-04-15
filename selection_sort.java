import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        int n,i,j,ioc,temp;

        System.out.println("Enter number of array : ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter an array");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for(i=0;i<n-1;i++){
            ioc=i;
            for(j=i+1;j<n;j++){
                if(a[j] < a[ioc]){
                    ioc=j;
                }
            }
            temp= a[i];
            a[i]= a[ioc];
            a[ioc] = temp;
        }

        System.out.println("Ordered Array");
        for(i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
    }
}
