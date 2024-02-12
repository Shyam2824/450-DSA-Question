// Reverse array

import java.util.Scanner;

public class a_01reverseArray{

    public static void reverse(int [] a){
        int t, i=0 ,j=a.length-1;
        int n;
        while(i<j){
            t=a[i];
            a[i]= a[j];
            a[j]=t;
            i++;
            j--;
        }
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of element");
        int n =sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
           // System.out.print(a[i] );
        }
        reverse(a);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}