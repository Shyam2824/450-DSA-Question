import java.util.Scanner;

public class binary_search03 {

    public static void main(String[] args) {
        
        System.out.println("Enter number of element : ");

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=  new int[n];
         
        System.out.println("Enter array : ");
        for(int i =0;i<n;i++){
            
            a[i]= sc.nextInt();
        }

        // code for binary search
        int beg=0,mid=0,end=n-1, c=0;
        System.out.println("item : ");
        int iteam= sc.nextInt();
        while(beg<=end){
            mid=(beg + end)/2;
        
        
        if(iteam == a[mid]){
            c++;
            break;
        }
        else if(iteam<a[mid]){
            end=mid-1;
        }
        else if( iteam > a[mid]){
            beg= mid+1;
        }
    }

        if(c>0){
            System.out.println("find iteams :" + mid);
        }
        else{
            System.out.println("not find ");
        }

    }
    
}
