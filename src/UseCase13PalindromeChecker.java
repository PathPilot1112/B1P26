import java.util.*;

class StackPalindrome {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equalsIgnoreCase(reversed);
    }
}

class DequePalindrome {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

class ReversePalindrome {

    public boolean check(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        return input.equalsIgnoreCase(reversed);
    }
}

public class UseCase13PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = scanner.nextLine();

        StackPalindrome stackAlgo = new StackPalindrome();
        DequePalindrome dequeAlgo = new DequePalindrome();
        ReversePalindrome reverseAlgo = new ReversePalindrome();

        long start1 = System.nanoTime();
        boolean result1 = stackAlgo.check(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = dequeAlgo.check(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = reverseAlgo.check(input);
        long end3 = System.nanoTime();

        System.out.println("Stack Result: " + result1 + " Time: " + (end1 - start1));
        System.out.println("Deque Result: " + result2 + " Time: " + (end2 - start2));
        System.out.println("Reverse Result: " + result3 + " Time: " + (end3 - start3));

        scanner.close();
    }
}