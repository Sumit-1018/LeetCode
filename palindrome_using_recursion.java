public class palindrome_using_recursion {
    public static void main(String[] args) {
        String s= "racecar";
        System.out.println(isPalindrome(s));
        System.out.print(power(8, 2));
    
    }
    public static boolean isPalindrome(String s){
        int a=s.length();
        if(a==0 || a==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(a-1)){
            return isPalindrome(s.substring(1,a-1));
        }
        else{
            return false;
        }  
    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        else{
            return a*power(a,b-1);
        }
    }
}