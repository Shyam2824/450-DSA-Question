import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] cumulativeSum = new int[numbers.length];

        cumulativeSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + numbers[i];
        }

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Cumulative sum array: " + Arrays.toString(cumulativeSum));
    }
}
