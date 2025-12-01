import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        System.out.println("Factors of " + N + " are:");

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
