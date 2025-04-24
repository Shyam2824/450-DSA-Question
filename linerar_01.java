import java.util.Scanner;

public class linerar_01 {
    public static void main(String[] args) {
         System.out.println("Enter number of Element: ");

         int i;
         
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         int []a= new int[n];

         System.out.println("Enter element : ");

         for(i =0;i<=n;i++){
            a[i]= sc.nextInt();
         }


         System.out.println("Enter target items:  ");
         int target, c=0;
         target=sc.nextInt();

         for( i=0;i<a.length;i++){
            if(target==a[i])
            c++;
            break;
         }
         if(c>0){
            System.out.println("Exist at " + i );
        }
        else
        System.out.println("not exist");
    }
}
