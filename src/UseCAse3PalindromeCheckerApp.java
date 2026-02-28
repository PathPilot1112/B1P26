import java.util.*;

public class  UseCAse3PalindromeCheckerApp{

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "level";
        for(int i = s.length()-1;i>0;i--){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                IsPalindrome=true;

            }
            else{
                IsPalindrome=false;
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