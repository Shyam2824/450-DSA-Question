import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int n, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items:");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Insertion Sort
        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }

        System.out.println("Sorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}



