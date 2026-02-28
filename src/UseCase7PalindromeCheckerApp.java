import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "bob";

        Deque <Character> deque = new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            deque.addFirst(ch);
        }

        for(char ch:s.toCharArray()){


                if(ch!=deque.removeFirst()){
                    IsPalindrome = false;
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