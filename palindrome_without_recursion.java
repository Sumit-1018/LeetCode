public class palindrome_without_recursion {
    public static void main(String[] args) {
        String s="racecar";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        int a=s.length();
        int i=0;
        while(i<a-1){
            if(s.charAt(i)!=s.charAt(a-1)){
                return false;
        
        }
        i++;
        a--;
    }
        return true;
}}
