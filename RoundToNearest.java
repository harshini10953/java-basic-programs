//Round to Nearest Greater Integer
//Question:
//Given a floating point number with 1 decimal place round it off to nearest greater integer and print it.
//Sample Input:
//2.6
//Sample Output:
//3

import java.util.Scanner;
public class RoundToNearest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        int result = (int)Math.ceil(num);   

        System.out.println(result);
    }
}


