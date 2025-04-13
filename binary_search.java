import java.util.Scanner;

public class binary_search {
    
    public static void main(String[] args) {
        int n, iteam, i , c=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of Array: ");

        n= sc.nextInt();
        int a[]= new int[n]; 
        
        System.out.println("Enter Array");
        for(i=0;i<n;i++)
        a[i]= sc.nextInt();

        System.out.println("Enter Iteam");
        iteam= sc.nextInt();

        int beg=0; int end=n-1; int mid=0;
        while(beg<=end){
             mid = (beg + end )/2;

            if(iteam == a[mid]){
                c++;
                break;
            }
            else if(iteam > a[mid]){
                beg=mid+1;
            }
            else if(iteam < a[mid]){
                end= mid-1;
            }
        }

        if(c>0){
            System.out.println("Iteam found " + mid );
        }
        else{
            System.out.println("not found");
        }
    }
}
