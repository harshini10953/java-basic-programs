import java.util.Scanner;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // ignoring spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequency dictionary: " + freqMap);
    }
}
