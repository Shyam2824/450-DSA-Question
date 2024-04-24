import java.util.Scanner;

public class CumulativeSum{
    public static int[] main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array");
        int n= sc.nextInt();
        int [] a= new int[n];
        for(int i=0;i<a.length;++i)
        a[i]+=a[i-1];
        return a;
    }
}