import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String subStr = sc.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("\"" + subStr + "\" exists in the main string.");
        } else {
            System.out.println("\"" + subStr + "\" does not exist in the main string.");
        }
    }
}
