import java.util.Scanner;

public class linerar_search {

    public static void main(String[] args) {
        
        int n, i, iteam, c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of Array: ");
        n=sc.nextInt();
        int []a= new int[n];

        System.out.println("Enter your array: ");
        for(i=0;i<n;i++)
            a[i]= sc.nextInt();
        
        System.out.println("Enter your find items: ");
        iteam= sc.nextInt();

        for(i=0;i<a.length;i++){
            if(a[i]==iteam){
                c++;
                break;
            }
        }
        if(c>0){
            System.out.println("Exist at " + i);
        }
        else
        System.out.println("not exist");

    }
}
