import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "bob";

        Stack <Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            stack.push(ch);
        }

        Queue <Character> q = new LinkedList<>();
        for(char ch: s.toCharArray()){
            q.add(ch);
        }

        while(!q.isEmpty()){

                if(q.remove()!=stack.pop()){
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