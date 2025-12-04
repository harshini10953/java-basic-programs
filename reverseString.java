import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        
        for(int i=userInput.length()-1;i>=0;i--)
        {
            System.out.print(userInput.charAt(i));
        }
    }
}