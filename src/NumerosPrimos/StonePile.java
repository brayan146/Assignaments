package NumerosPrimos;

import java.util.Scanner;

public class StonePile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println(minDifference(weights, n, 0, 0));
    }

    public static int minDifference(int[] weights, int n, int sum1, int sum2) {
        if (n == 0) {
            return Math.abs(sum1 - sum2);
        }
        return Math.min(minDifference(weights, n - 1, sum1 + weights[n - 1], sum2),
                        minDifference(weights, n - 1, sum1, sum2 + weights[n - 1]));
    }
}

