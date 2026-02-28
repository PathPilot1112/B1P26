import java.util.*;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "bob";

        Stack <Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            stack.push(ch);
        }

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                if(ch!=stack.pop()){
                    IsPalindrome = false;
                }


            }
        }


        if(IsPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}