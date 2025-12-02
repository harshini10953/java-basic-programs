// Check if Number is Composite
// Problem Statement:
// Given a number N, print 'yes' if it is composite else print 'no'.


// Sample Input:
// 123


// Sample Output:
// yes

import java.util.*;

class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("no");
            return;
        }

        boolean isComposite = false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}



