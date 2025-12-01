import java.util.Scanner;

public class SumEvenNumbersUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers up to " + N + " is " + sum);
    }
}
