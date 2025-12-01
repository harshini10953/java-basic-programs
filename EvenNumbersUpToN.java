import java.util.Scanner;

public class EvenNumbersUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        System.out.println("Even numbers up to " + N + ":");

        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
