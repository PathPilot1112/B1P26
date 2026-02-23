public class PalindromeChecker {
    public static class UseCase2{
        public UseCase2(String s){
            s=s.toLowerCase();
            boolean isPlaindrome;
            int start= 0;
            int end = s.length() -1;
            while(start<end){
                if(s.charAt(start) != s.charAt(end)){
                    isPlaindrome=false;
                }
                    start++;
                    end--;
            }

            isPlaindrome=true;

            if(isPlaindrome){
                System.out.println("Is it a Palindrome:Yes");
            }
            else{
                System.out.println("Is it a Palindrome:No");
            }

        }


    }
    public static void main(String[] args){
        String s = "madam";
        System.out.println(("Input Text: madam"));
        UseCase2 entry = new UseCase2(s);



    }
}
