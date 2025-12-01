import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound (L): ");
        int L = sc.nextInt();

        System.out.print("Enter the upper bound (R): ");
        int R = sc.nextInt();

        System.out.println("Prime numbers between " + L + " and " + R + ":");

        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
