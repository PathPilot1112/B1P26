public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "bob";
        char[] array = s.toCharArray();
        int start =0;
        int end = s.length()-1;

        while(start<end){
            if(array[start]!=array[end]){
                IsPalindrome = false;

            }
            start++;
            end--;
        }

        if(IsPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}