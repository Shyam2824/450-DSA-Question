import java.util.Scanner;

public class binary02 {
    public static void main(String[] args) {
        int i,n,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of array : ");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter Array Element : ");

        for(i=0;i<n;i++)
        a[i]= sc.nextInt();

        int beg=0, mid=0, end=n-1, find;
        System.out.println("Enter find iteams: ");
        find=sc.nextInt();
        while(beg<=end){
            mid= (beg + end)/2;

            if(find== a[mid]){
                c++;
                break;
            }
            else if(find>a[mid]){
                beg=mid+1;
            }
            else if(find<a[mid]){
                end=mid-1;

            }
        }

        if(c>0){
            System.out.println("item find" + mid);
        }

        else
        System.out.println("not find");
    }

}
