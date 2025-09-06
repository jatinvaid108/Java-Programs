package Hashing;
import java.util.*;
import java.util.HashMap;

//Hashmaps can return the value in constant time O(1)
public class basic {
    public static void main(String[] args) {
        String name="Jatin";
        int code=name.hashCode();
        System.out.println(code);    //Will convert string into a random int value


        HashMap<String,Integer> map=new HashMap<>();

        map.put("Jatin",44);
        map.put("Kartik",77);
        map.put("RAM",108);

        System.out.println(map.get("RAM"));
    }
}



class PalindromeChecker {
    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.add(ch);
        }

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}