import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int n,i,j,temp =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of items");
        n = sc.nextInt();
        int a[]= new int[n];

        System.out.println("Enter Array");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for(i=1;i<=n;i++)
        {
            temp=a[i];
            j=i-1;
            while (temp<a[j] && j>-1) 
            {
                a[j+1] = a[j];
                j= j-1;
            }
            a[j+1] = temp;
        }
        for(i=0;i<n; i++){
            System.out.println(a[i]);
        }
    }
}


